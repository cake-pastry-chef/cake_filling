package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        name = "MONTHLY_CALCULATE_SEQ_GENERATOR",
        sequenceName = "MONTHLY_CALCULATE_SEQ",
        initialValue = 1,
        allocationSize = 1
)
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
