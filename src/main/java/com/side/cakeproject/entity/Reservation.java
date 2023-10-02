package com.side.cakeproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "shop_id")
    private int shopId;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "call")
    private String call;
    @Column(name = "regist_date")
    private Timestamp registDate;
    @Column(name = "receive_date")
    private Timestamp receiveDate;
    @Column(name = "deposit")
    private String deposit;
}
