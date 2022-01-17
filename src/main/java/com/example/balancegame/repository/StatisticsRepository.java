package com.example.balancegame.repository;

import com.example.balancegame.composite.StatisticsCompositeKey;
import com.example.balancegame.entity.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatisticsRepository extends JpaRepository<Statistics, StatisticsRepository> {

    List<Statistics> findById(StatisticsCompositeKey id);
}
