package com.side.cakeproject.domain;

import jdk.jshell.Snippet;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class WeeklyCalculateDTO {
    private int id;
    private int shop_id;
    private int sales_amount;
    private int expense_amount;
    private LocalDateTime start_date;
    private LocalDateTime end_date;

    /*public WeeklyCalculateDTO toEntity(){
        WeeklyCalculateDTO weeklyCalculateDTO = WeeklyCalculateDTO.build()
                .id(id)
                .shop_id(shop_id)
                .sales_amount(sales_amount)
                .expense_amount(expense_amount)
                .start_date(start_date)
                .end_date(end_date)
                .build();
        return weeklyCalculateDTO;
    }*/


    @Builder
    public WeeklyCalculateDTO(int id, int shop_id, int sales_amount, int expense_amount, LocalDateTime start_date,
                              LocalDateTime end_date){
        this.id = id;
        this.shop_id = shop_id;
        this.sales_amount = sales_amount;
        this.expense_amount = expense_amount;
        this.start_date = start_date;
        this.end_date = end_date;
    }
}
