package com.example.balancegame.service;

import com.example.balancegame.dto.StatisticsDto;

import java.util.List;

public interface StatisticsService {
    List<StatisticsDto> getAllStatistics();
}