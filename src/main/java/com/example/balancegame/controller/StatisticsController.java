package com.example.balancegame.controller;

import com.example.balancegame.dto.ApiResponseDto;
import com.example.balancegame.dto.QuestionDto;
import com.example.balancegame.dto.StatisticsDto;
import com.example.balancegame.exception.BackendException;
import com.example.balancegame.service.QuestionService;
import com.example.balancegame.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/1.0/statistics")
public class StatisticsController {

    private StatisticsService statisticsService;

    @Autowired
    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping
    public ApiResponseDto getAllStatistics() throws BackendException {
        try {
            return new ApiResponseDto(true, statisticsService.getAllStatistics(), null);
        } catch (Exception e) {
            throw new BackendException(e.getMessage());
        }
    }
}
