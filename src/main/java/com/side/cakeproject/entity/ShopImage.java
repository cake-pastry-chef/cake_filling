package com.side.cakeproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop_image")
public class ShopImage {
    @Id
    private int id;
    @Column(name = "image")
    private String image;
    @Column(name = "shop_id")
    private int shopId;

}
