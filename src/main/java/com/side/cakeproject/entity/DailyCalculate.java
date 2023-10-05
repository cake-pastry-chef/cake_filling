package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@SequenceGenerator(
        name = "DAILY_SEQUENCE_GENERATOR",
        sequenceName = "DAILY_CALCULATE_SEQ",
        initialValue = 1,
        allocationSize = 1
)
@Table(name = "daily_calculate")
public class DailyCalculate {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
            , generator = "DAILY_SEQUENCE_GENERATOR"
    )
    private int id;
    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "sales_amount")
    private int salesAmonut;
    @Column(name = "expense_amount")
    private int expenseAmount;
    @Column(name = "calculate_date")
    private Timestamp calculateDate;

    public DailyCalculate(int sales_amount, LocalDate calculate_date){

    };

}
