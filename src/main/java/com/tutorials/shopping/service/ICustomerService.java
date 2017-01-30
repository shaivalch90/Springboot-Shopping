package com.tutorials.shopping.service;

import com.tutorials.shopping.dto.CustomerDto;
import org.springframework.stereotype.Service;

/**
 * Created by schettipally on 1/29/17.
 */
@Service
public interface ICustomerService {

    CustomerDto create(CustomerDto customerDto);
}
