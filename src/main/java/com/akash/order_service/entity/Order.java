package com.akash.order_service.entity;

import com.akash.order_service.dto.FoodInventoryDTO;
import com.akash.order_service.dto.RestaurantDTO;
import com.akash.order_service.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Author: akash
 * Date: 19/11/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order extends MongoBaseEntity {
    private Long id;
    private List<FoodInventoryDTO> foodInventoryList;
    private RestaurantDTO restaurant;
    private UserDTO user;

}
