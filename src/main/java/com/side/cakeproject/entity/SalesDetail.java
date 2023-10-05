package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        name = "SALES_DETAIL_SEQ_GENERATOR",
        sequenceName = "SALES_DETAIL_SEQ",
        initialValue = 1,
        allocationSize = 1
)
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
