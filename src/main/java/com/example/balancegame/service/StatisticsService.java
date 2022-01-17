package com.example.balancegame.service;

import com.example.balancegame.dto.StatisticsDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StatisticsService {
    List<StatisticsDto> getAllStatistics();

    String insertStatisticsService(Long catalog_id,List<Integer> check);
}