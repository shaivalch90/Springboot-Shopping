package com.tutorials.shopping.facade.impl;

import com.tutorials.shopping.dto.CustomerDto;
import com.tutorials.shopping.facade.ICustomerFacade;
import com.tutorials.shopping.model.Customer;
import com.tutorials.shopping.repository.CustomerRepository;
import com.tutorials.shopping.service.ICustomerService;
import com.tutorials.shopping.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by schettipally on 1/29/17.
 */
@Component
public class CustomerFacade implements ICustomerFacade {

    @Autowired
    private ICustomerService service;

    @Override
    public CustomerDto create(CustomerDto customerDto) {
        return service.create(customerDto);
    }
}
