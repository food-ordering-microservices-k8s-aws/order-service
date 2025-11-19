package com.akash.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: akash
 * Date: 19/11/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String userName;
    private String userPassword;
    private String address;
    private String city;

}
