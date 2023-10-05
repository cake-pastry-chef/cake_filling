package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        name = "MONTHLY_ORDER_SEQ_GENERATOR",
        sequenceName = "MONTHLY_ORDER_SEQ",
        initialValue = 1,
        allocationSize = 1
)
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
