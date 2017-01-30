package com.tutorials.shopping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by schettipally on 1/29/17.
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String creditCardNumber;
    private String createdDate;
    private String modifiedDate;
}
