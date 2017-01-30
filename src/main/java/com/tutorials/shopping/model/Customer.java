package com.tutorials.shopping.model;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.tutorials.shopping.dto.CustomerDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

@Data
@Entity
@EqualsAndHashCode
@Table(name="customer")
public class Customer {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "credit_card_number")
    private String creditCardNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "create_date", insertable = false, updatable = false)
    private Date createdDate;

    @Column(name = "modified_date", insertable = false)
    private Date modifiedDate;

    public static CustomerDto converToExternal(Customer customer) {
        CustomerDto dto = new CustomerDto();
        BeanUtils.copyProperties(customer, dto);
        return dto;
    }

    public static Customer converToInternal(CustomerDto customerDto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        return customer;
    }
}
