package com.tutorials.shopping.repository;

import java.util.UUID;
import com.tutorials.shopping.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by schettipally on 1/29/17.
 */
public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID> {
}
