package com.side.cakeproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "weekly_calculate")
public class WeeklyCalculate {
    @Id
    private int id;
    @Column(name = "shop_id")
    private int shopId;
    @Column(name = "sales_amount")
    private int salesAmount;
    @Column(name = "expense_amount")
    private int expenseAmount;
    @Column(name = "start_date")
    private Timestamp startDate;
    @Column(name = "end_date")
    private Timestamp endDate;
}
