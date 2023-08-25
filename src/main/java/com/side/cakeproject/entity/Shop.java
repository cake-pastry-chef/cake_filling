package com.side.cakeproject.entity;

import com.side.cakeproject.common.Address;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@SequenceGenerator(
        sequenceName = "SHOP_SEQ_GENERATOR"
        , name = "SHOP_SEQ"
        , initialValue = 1
        , allocationSize = 1
)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Shop {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
            , generator = "SHOP_SEQ_GENERATOR"
    )
    @Comment("매장 PK")
    private long id;

    @OneToOne
    @JoinColumn(name = "member_id", referencedColumnName = "no")
    private Member member;

    @Column(name = "name", nullable = false, length = 20)
    @Comment("매장명")
    private String name;

    @Column(name = "call", length = 15)
    @Comment("매장 전화번호")
    private String call;

    @Embedded
    private Address address;

    @Column(name = "open_time")
    @Comment("매장 오픈 시간")
    private int openTime;

    @Column(name = "close_time")
    @Comment("매장 클로즈 시간")
    private int closeTime;

    @Column(name = "regist_date")
    @CreationTimestamp
    @Comment("매장 등록일")
    private Timestamp registDate;

    @Builder(builderClassName = "ShopBuilder", builderMethodName = "ShopBuilder")
    public Shop(String name, String call, Address address, int openTime, int closeTime) {
        this.name = name;
        this.call = call;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}
