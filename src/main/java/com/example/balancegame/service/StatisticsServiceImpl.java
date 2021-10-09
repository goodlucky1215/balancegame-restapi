package com.example.balancegame.service;

import com.example.balancegame.dto.CatalogDto;
import com.example.balancegame.dto.StatisticsDto;
import com.example.balancegame.entity.Catalog;
import com.example.balancegame.entity.Statistics;
import com.example.balancegame.repository.CatalogRepository;
import com.example.balancegame.repository.StatisticsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private StatisticsRepository statisticsRepository;
    private ModelMapper modelMapper;

    @Autowired
    public StatisticsServiceImpl(StatisticsRepository statisticsRepository, ModelMapper modelMapper) {
        this.statisticsRepository = statisticsRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StatisticsDto> getAllStatistics() {
        List<Statistics> statistics = statisticsRepository.findAll();
        return statistics.stream().map(s -> modelMapper.map(s, StatisticsDto.class)).collect(Collectors.toList());
    }
}
