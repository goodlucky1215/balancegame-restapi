package com.example.balancegame.service;

import com.example.balancegame.composite.StatisticsCompositeKey;
import com.example.balancegame.dto.CatalogDto;
import com.example.balancegame.dto.QuestionDto;
import com.example.balancegame.dto.StatisticsDto;
import com.example.balancegame.entity.Catalog;
import com.example.balancegame.entity.Statistics;
import com.example.balancegame.repository.CatalogRepository;
import com.example.balancegame.repository.StatisticsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public String insertStatisticsService(Long catalogId,List<Integer> check) {
        System.out.print("dfffffffffffffffffffffffffff");
        for(int i=0;i<check.size();i++){
            StatisticsCompositeKey id = new StatisticsCompositeKey();
            id.setCatalogId(catalogId);
            id.setChoice(check.get(i));
            List<Statistics> statisticsResult = statisticsRepository.findById(id);
            System.out.print("dfffffffffffffffffffffffffff   =>"+statisticsResult.get(0).getResult1());
            Statistics statistics = new Statistics();
            statistics.getId().setCatalogId(catalogId);
            statistics.getId().setChoice(check.get(i));
            switch (i+1){
                case 1 : statistics.setResult1(statisticsResult.get(0).getResult1()+1);
                    break;
                case 2 : statistics.setResult2(statisticsResult.get(0).getResult2()+1);
                    break;
                case 3 :  statistics.setResult3(statisticsResult.get(0).getResult3()+1);
                    break;
                case 4 : statistics.setResult4(statisticsResult.get(0).getResult4()+1);
                    break;
                case 5 :  statistics.setResult5(statisticsResult.get(0).getResult5()+1);
                    break;
                case 6 :  statistics.setResult6(statisticsResult.get(0).getResult6()+1);
                    break;
                case 7 :  statistics.setResult7(statisticsResult.get(0).getResult7()+1);
                    break;
                case 8 :  statistics.setResult8(statisticsResult.get(0).getResult8()+1);
                    break;
                case 9 :  statistics.setResult9(statisticsResult.get(0).getResult9()+1);
                    break;
                case 10 :  statistics.setResult10(statisticsResult.get(0).getResult10()+1);
                    break;
                case 11 : statistics.setResult11(statisticsResult.get(0).getResult11()+1);
                    break;
                case 12 : statistics.setResult12(statisticsResult.get(0).getResult12()+1);
                    break;
                case 13 : statistics.setResult13(statisticsResult.get(0).getResult13()+1);
                    break;
                case 14 : statistics.setResult14(statisticsResult.get(0).getResult14()+1);
                    break;
                case 15 : statistics.setResult15(statisticsResult.get(0).getResult15()+1);
                    break;
                case 16 : statistics.setResult16(statisticsResult.get(0).getResult16()+1);
                    break;
            }
            System.out.print("dfffhthrhtfffffffffffff");
            statisticsRepository.save(statistics);
        }
        return "success";
    }

}
