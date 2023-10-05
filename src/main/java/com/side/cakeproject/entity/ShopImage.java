package com.side.cakeproject.entity;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        sequenceName = "SHOP_IMAGE_SEQ_GENERATOR"
        , name = "SHOP_IMAGE_SEQ"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "shop_image")
public class ShopImage {
    @Id
    private int id;
    @Column(name = "image")
    private String image;
    @Column(name = "shop_id")
    private int shopId;

}
