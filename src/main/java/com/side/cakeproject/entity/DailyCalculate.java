package com.side.cakeproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "daily_calculate")
public class DailyCalculate {
    @Id
    @GeneratedValue
    private int id;

}
