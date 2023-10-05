package com.side.cakeproject.repository;

import com.side.cakeproject.entity.DailyCalculate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyCalculateRepository extends JpaRepository<DailyCalculate, Integer> {
}
