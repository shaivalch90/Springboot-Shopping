package com.tutorials.shopping.model;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by schettipally on 1/29/17.
 */
@Data
@Entity
@EqualsAndHashCode
@Table(name="product")
public class Product {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private UUID id;

    @Column(name = "name")
    private UUID productId;

    @Column(name = "company")
    private String company;

    @Column(name = "create_date", insertable = false, updatable = false)
    private Date createdDate;

    @Column(name = "modified_date", insertable = false)
    private Date modifiedDate;
}
