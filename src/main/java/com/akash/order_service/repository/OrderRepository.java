package com.akash.order_service.repository;

import com.akash.order_service.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author: akash
 * Date: 19/11/25
 */
public interface OrderRepository extends MongoRepository<Order, String> {
}
