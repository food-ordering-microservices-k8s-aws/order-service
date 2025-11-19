package com.akash.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: akash
 * Date: 19/11/25
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodInventoryDTO {

    private Long id;
    private String itemName;
    private String itemDescription;
    private Boolean isVeg;
    private Long price;
    private Integer restaurantId;
    private Integer quantity;
}
