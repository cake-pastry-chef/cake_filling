package com.side.cakeproject.entity;

import com.side.cakeproject.common.Address;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;

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
public class Shop implements Persistable<Long> {
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
    private String name;

    @Column(name = "call", length = 15)
    private String call;

    @Embedded
    private Address address;

    @Column(name = "open_time")
    private int openTime;

    @Column(name = "close_time")
    private int closeTime;

    @Column(name = "regist_date")
    @CreatedDate
    private Timestamp registDate;

    @Builder
    public Shop(String name, String call, Address address, int openTime, int closeTime) {
        this.name = name;
        this.call = call;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    @Override
    public boolean isNew() {
        return registDate == null;
    }

    public Long getId() {
        return this.id;
    }
}
