package com.side.cakeproject.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "reservation")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SequenceGenerator(
        name = "reservation_seq_generator",
        sequenceName = "reservation_seq",
        initialValue = 1,
        allocationSize = 1
)
@Getter
public class Reservation implements Persistable<Integer> {
    @Id
    @GeneratedValue(
            generator = "reservation_seq_generator",
            strategy = GenerationType.SEQUENCE
    )
    private int id;

    private String name;
    private String call;
    @CreatedDate
    @Column(name = "regist_date")
    private Timestamp registDate;
    @Column(name = "receive_date")
    private Timestamp receiveDate;
    private String deposit;

    @OneToOne
    @JoinColumn(name = "id")
    private Shop shop;

    @OneToOne
    @JoinColumn(name = "id")
    private Product product;


    @Override
    public boolean isNew() {
        return registDate == null;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Builder
    public Reservation (String name, Shop shop, Product product, String call, Timestamp receiveDate, String deposit) {
        this.name = name;
        this.shop = shop;
        this.product = product;
        this.call = call;
        this.receiveDate = receiveDate;
        this.deposit = deposit;
    }
}
