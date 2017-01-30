package com.tutorials.shopping.service.impl;

import com.tutorials.shopping.dto.CustomerDto;
import com.tutorials.shopping.model.Customer;
import com.tutorials.shopping.repository.CustomerRepository;
import com.tutorials.shopping.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by schettipally on 1/29/17.
 */
@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDto create(CustomerDto customerDto) {
        return Customer.converToExternal(customerRepository.save(Customer.converToInternal(customerDto)));
    }
}
