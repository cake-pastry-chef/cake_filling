package com.side.cakeproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "monthly_order")
public class MonthlyOrder {
    @Id
    private int id;

    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "count")
    private int count;

    @Column(name = "order_date")
    private Timestamp orderDate;
}
