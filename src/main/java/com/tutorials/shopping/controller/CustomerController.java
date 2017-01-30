package com.tutorials.shopping.controller;

import com.google.common.base.Preconditions;
import com.tutorials.shopping.dto.CustomerDto;
import com.tutorials.shopping.facade.ICustomerFacade;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javassist.tools.web.BadHttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by schettipally on 1/29/17.
 */
@RestController
@RequestMapping(value = "/shopping/v1/customer")
@Api(value = "Customer", description = "The Customer API")
public class CustomerController {

    @Autowired
    private ICustomerFacade facade;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a Customer", notes = "creates a customer with customer dto and returns created customer dto")
    public CustomerDto create(@RequestBody final CustomerDto customerDto) {
        Preconditions.checkNotNull(customerDto);
        return facade.create(customerDto);
    }
}
