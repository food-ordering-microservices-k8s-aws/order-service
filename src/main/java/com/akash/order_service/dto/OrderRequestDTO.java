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
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {

    private List<FoodInventoryDTO> foodInventoryDTOList;
    private Long userId;
    private RestaurantDTO restaurantDTO;
}
