package com.akash.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: akash
 * Date: 19/11/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Integer id;
    private List<FoodInventoryDTO> foodInventoryList;
    private RestaurantDTO restaurant;
    private UserDTO user;
}
