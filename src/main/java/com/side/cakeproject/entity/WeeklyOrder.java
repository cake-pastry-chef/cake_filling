package com.side.cakeproject.entity;

import com.side.cakeproject.common.Address;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        name = "WEEKLY_ORDER_SEQ_GENERATOR",
        sequenceName = "WEEKLY_ORDER_SEQ",
        initialValue = 1,
        allocationSize = 1
)
@Table(name = "weekly_order")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WeeklyOrder {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "weekly_order_seq"
    )
    private int id;

    @Column(name = "shop_id")
    private int shopId;

    private int count;

    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "end_date")
    private Timestamp endDate;

    @Builder(builderClassName = "WeeklyOrderBuilder", builderMethodName = "WeelyOrderBuilder")
    public WeeklyOrder(int shopId, int count, Timestamp startDate, Timestamp endDate) {
        this.shopId = shopId;
        this.count = count;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
