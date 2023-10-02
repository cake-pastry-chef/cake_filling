package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "daily_calculate")
public class DailyCalculate {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "sales_amount")
    private int salesAmonut;
    @Column(name = "expense_amount")
    private int expenseAmount;
    @Column(name = "calculate_date")
    private Timestamp calculateDate;

}
