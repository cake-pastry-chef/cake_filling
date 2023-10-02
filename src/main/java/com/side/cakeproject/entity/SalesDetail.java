package com.side.cakeproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "sales_detail")
public class SalesDetail {
    @Id
    private int id;
    @Column(name = "shop_id")
    private int shopId;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "sales_date")
    private Timestamp salesDate;
}
