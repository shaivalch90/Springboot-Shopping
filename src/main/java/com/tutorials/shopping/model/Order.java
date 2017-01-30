package com.tutorials.shopping.model;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by schettipally on 1/29/17.
 */
@Data
@Entity
@EqualsAndHashCode
@Table(name="order")
public class Order {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private UUID id;

    @Column(name = "product_id")
    private UUID productId;

    @Column(name = "customer_id")
    private UUID customerId;

    @Column(name = "shipping_address")
    private String address;

    @Column(name = "create_date", insertable = false, updatable = false)
    private Date createdDate;

    @Column(name = "modified_date", insertable = false)
    private Date modifiedDate;
}
