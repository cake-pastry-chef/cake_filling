package com.side.cakeproject.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class WeeklyOrderDTO {
    private int id;
    private int shop_id;
    private int count;
    private LocalDateTime start_date;
    private LocalDateTime end_date;

    public WeeklyOrderDTO toEntity(){
        WeeklyOrderDTO weeklyOrderDTO = WeeklyOrderDTO.builder()
                .id(id)
                .shop_id(shop_id)
                .count(count)
                .start_date(start_date)
                .end_date(end_date)
                .build();
        return weeklyOrderDTO;
    }

    @Builder
    public WeeklyOrderDTO(int id, int shop_id, int count, LocalDateTime start_date, LocalDateTime end_date){
        this.id = id;
        this.shop_id = shop_id;
        this.count = count;
        this.start_date = start_date;
        this.end_date = end_date;
    }
}
