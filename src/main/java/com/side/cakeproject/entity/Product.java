package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        name = "PRODUCT_SEQ_GENERATOR",
        sequenceName = "PRODUCT_SEQ",
        initialValue = 1,
        allocationSize = 1
)
@Table(name = "product")
public class Product {
    @Id
    private int id;
    @Column(name = "price")
    private int price;
    @Column(name = "image")
    private String image;
    @Column(name = "description")
    private String description;
    @Column(name = "shop_id")
    private int shopId;
    @Column(name = "regist_date")
    private Timestamp registDate;
    @Column(name = "name")
    private String name;
}
