package com.side.cakeproject.entity;

import com.side.cakeproject.repository.DailyCalculateRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class DailyCalculateTest {

    @Autowired
    private DailyCalculateRepository dailyCalculateRepository;
    SessionFactory sessionFactory;

    @Test
    public void save_my_first_object_to_the_db(){
        DailyCalculate dailyCalculate = new DailyCalculate(500000, LocalDate.now());

        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(dailyCalculate);

            session.getTransaction().commit();
        }
    }

    @Test
    @Disabled
    public void test1(){
        DailyCalculate dailyCalculate = dailyCalculateRepository.getReferenceById(1);
        System.out.println(dailyCalculate.getClass()+"실행완료");
    };
}
