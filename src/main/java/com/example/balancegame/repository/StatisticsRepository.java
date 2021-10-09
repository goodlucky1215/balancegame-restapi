package com.example.balancegame.repository;

import com.example.balancegame.composite.StatisticsCompositeKey;
import com.example.balancegame.entity.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticsRepository extends JpaRepository<Statistics, StatisticsCompositeKey> {

}
