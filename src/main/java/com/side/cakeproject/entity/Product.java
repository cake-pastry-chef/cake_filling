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
@Table(name = "product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SequenceGenerator(
        name = "product_seq_generator",
        sequenceName = "product_seq",
        initialValue = 1,
        allocationSize = 50
)
@Getter
public class Product implements Persistable<Long> {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_seq_generator"
    )
    private Long id;
    private String name;
    private int price;
    private String image;
    private String description;
    @CreatedDate
    @Column(name = "regist_date")
    private Timestamp registDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Shop shop;

    @Builder
    public Product (String name, int price, String image, String description, Shop shop) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
        this.shop = shop;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return registDate == null;
    }
}
