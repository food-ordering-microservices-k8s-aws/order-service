package com.akash.order_service.service;

import com.akash.order_service.dto.OrderDTO;
import com.akash.order_service.dto.OrderRequestDTO;
import com.akash.order_service.dto.UserDTO;
import com.akash.order_service.entity.Order;
import com.akash.order_service.mapper.OrderMapper;
import com.akash.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Author: akash
 * Date: 19/11/25
 */
@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    private final SequenceGenerator sequenceGenerator;

    private final RestTemplate restTemplate;

    @Value("${services.account-service.url}")
    private String accountServiceUrl;


    public OrderDTO saveOrderInDb(OrderRequestDTO orderRequestDTO) {
        Long newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserDetailsFromUserId(orderRequestDTO.getUserId());
        Order orderToBeSaved = new Order(newOrderID, orderRequestDTO.getFoodInventoryDTOList(), orderRequestDTO.getRestaurantDTO(), userDTO );
        orderRepository.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
    }

    private UserDTO fetchUserDetailsFromUserId(Long userId) {
        return restTemplate.getForObject(accountServiceUrl+"/user/findUserAccountById/" + userId, UserDTO.class);
    }
}
