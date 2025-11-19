package com.akash.order_service.mapper;

import com.akash.order_service.dto.OrderDTO;
import com.akash.order_service.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Author: akash
 * Date: 19/11/25
 */
@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}
