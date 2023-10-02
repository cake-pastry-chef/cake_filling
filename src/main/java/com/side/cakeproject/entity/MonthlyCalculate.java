package com.side.cakeproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "monthly_calculate")
public class MonthlyCalculate {
    @Id
    private int id;

    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "sales_amount")
    private int salesAmount;

    @Column(name = "expense_amount")
    private int expenseAmount;
    @Column(name = "calculate_date")
    private Timestamp calculateDate;
}
