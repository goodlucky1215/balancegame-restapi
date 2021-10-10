package com.example.balancegame.service;

import com.example.balancegame.dto.CatalogDto;
import com.example.balancegame.dto.QuestionDto;
import com.example.balancegame.dto.StatisticsDto;
import com.example.balancegame.entity.Catalog;
import com.example.balancegame.entity.Statistics;
import com.example.balancegame.repository.CatalogRepository;
import com.example.balancegame.repository.StatisticsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        List<StatisticsDto> statisticsDtos = new ArrayList<>();
        statistics.forEach(s -> {
            statisticsDtos.add(
                    StatisticsDto.builder()
                            .catalog(modelMapper.map(s.getCatalog(), CatalogDto.class))
                            .catalogId(s.getId().getCatalogId())
                            .choice(s.getId().getChoice())
                            .result1(s.getResult1()).result2(s.getResult2()).result3(s.getResult3()).result4(s.getResult4())
                            .result5(s.getResult5()).result6(s.getResult6()).result7(s.getResult7()).result8(s.getResult8())
                            .result9(s.getResult9()).result10(s.getResult10()).result11(s.getResult11()).result12(s.getResult12())
                            .result13(s.getResult13()).result14(s.getResult14()).result15(s.getResult15()).result16(s.getResult16())
                            .build()
            );
        });
        return statisticsDtos;
//        return statistics.stream().map(s -> modelMapper.map(s, StatisticsDto.class)).collect(Collectors.toList());
    }
}
