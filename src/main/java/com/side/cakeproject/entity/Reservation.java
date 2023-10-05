package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        name = "RESERVATION_SEQ_GENERATOR",
        sequenceName = "RESERVATION_SEQ",
        initialValue = 1,
        allocationSize = 1
)
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
