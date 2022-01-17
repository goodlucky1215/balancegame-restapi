package com.example.balancegame.controller;

import com.example.balancegame.dto.ApiResponseDto;
import com.example.balancegame.dto.QuestionDto;
import com.example.balancegame.dto.StatisticsDto;
import com.example.balancegame.exception.BackendException;
import com.example.balancegame.service.QuestionService;
import com.example.balancegame.service.StatisticsService;
import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Clock;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/1.0/statistics")
@Slf4j
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

    @PostMapping("/insert")
    public ApiResponseDto insertStatisticsController(@RequestBody String req) throws BackendException {
        ModelMapper mapper = new ModelMapper();
        System.out.print(req);
        Gson gson = new Gson();
        Map map = gson.fromJson(req, Map.class);
        Long catalogId = Long.parseLong(String.valueOf(Integer.parseInt(String.valueOf(Math.round((Double) map.get("catalogId"))))));
        List<Integer> check = (List<Integer>) map.get("check");

        try {
            return new ApiResponseDto(true, statisticsService.insertStatisticsService(catalogId,check), null);
        } catch (Exception e) {
            throw new BackendException(e.getMessage());
        }
    }
}
