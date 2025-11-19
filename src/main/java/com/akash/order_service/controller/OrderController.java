package com.akash.order_service.controller;

import com.akash.order_service.dto.OrderDTO;
import com.akash.order_service.dto.OrderRequestDTO;
import com.akash.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: akash
 * Date: 19/11/25
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/save")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderRequestDTO orderRequestDTO){
        OrderDTO savedOrderInDb = orderService.saveOrderInDb(orderRequestDTO);
        return new ResponseEntity<>(savedOrderInDb, HttpStatus.CREATED);
    }
}
