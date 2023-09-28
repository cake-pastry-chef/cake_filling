package com.side.cakeproject.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "daily_calculate")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SequenceGenerator(
        name = "dailyCalculate_seq_generator",
        sequenceName = "daily_calculate_seq",
        initialValue = 1,
        allocationSize = 1
)
public class DailyCalculate {
    @Id
    @GeneratedValue(
            generator = "dailyCalculate_seq_generator",
            strategy = GenerationType.SEQUENCE
    )
    private int id;

    @Column(name = "sales_amount")
    private int salesAmount;
    @Column(name = "expense_amount")
    private int expenseAmount;
    @Column(name = "calculate_date")
    private Timestamp calculateDate;

    @OneToOne
    @JoinColumn(name = "id")
    private Shop shop;

    @Builder
    public DailyCalculate(int salesAmount, int expenseAmount, Timestamp calculateDate, Shop shop) {
        this.salesAmount = salesAmount;
        this.expenseAmount = expenseAmount;
        this.calculateDate = calculateDate;
        this.shop = shop;
    }

    public void addSalesAmount(int salesPrice) {
        this.salesAmount += salesPrice;
    }

    public void addExpenseAmount(int expenseCost) {
        this.expenseAmount += expenseCost;
    }
}
