package com.side.cakeproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "expense_detail")
public class ExpenseDetail {
    @Id
    private int id;
    @Column(name = "shop_id")
    private int shopId;

    private String item;
    private int price;
    @Column(name = "expense_date")
    private Timestamp expenseDate;

}
