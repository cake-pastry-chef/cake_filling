package com.side.cakeproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "weekly_order")
public class WeeklyOrder {
    @Id
    @Column
    @GeneratedValue
    private int id;
}
