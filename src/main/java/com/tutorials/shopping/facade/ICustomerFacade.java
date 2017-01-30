package com.tutorials.shopping.facade;

import com.tutorials.shopping.dto.CustomerDto;

/**
 * Created by schettipally on 1/29/17.
 */
public interface ICustomerFacade {
    CustomerDto create(CustomerDto customerDto);
}
