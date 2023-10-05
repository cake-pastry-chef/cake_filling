package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        sequenceName = "WEEKLY_CALCULATE_SEQ_GENERATOR"
        , name = "WEEKLY_CALCULATE_SEQ"
        , initialValue = 1
        , allocationSize = 1
)
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
