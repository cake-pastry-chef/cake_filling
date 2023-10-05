package com.side.cakeproject.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        name = "EXPENSE_DETAIL_SEQ_GENERATOR",
        sequenceName = "EXPENSE_DETAIL_SEQ",
        initialValue = 1,
        allocationSize = 1
)
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
