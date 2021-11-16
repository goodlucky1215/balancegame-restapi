package com.example.balancegame.service;

import com.example.balancegame.dto.CatalogDto;
import com.example.balancegame.dto.QuestionDto;
import com.example.balancegame.dto.StatisticsDto;
import com.example.balancegame.entity.Catalog;
import com.example.balancegame.repository.CatalogRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class CatalogServiceImpl implements CatalogService {

    private CatalogRepository catalogRepository;
    private ModelMapper modelMapper;

    @Autowired
    public CatalogServiceImpl(CatalogRepository catalogRepository, ModelMapper modelMapper) {
        this.catalogRepository = catalogRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CatalogDto> getAllCatalogs() {
        List<Catalog> catalogs = catalogRepository.findAll();
        List<CatalogDto> catalogDtos = new ArrayList<>();
        catalogs.forEach(c -> {
            catalogDtos.add(
                CatalogDto.builder()
                        .catalogId(c.getCatalogId())
                        .catalogName(c.getCatalogName())
                        .questionDtos(c.getQuestions().stream().map(q -> modelMapper.map(q, QuestionDto.class)).collect(Collectors.toSet()))
//                        .statisticsDtos(c.getStatistics().stream().map(s -> modelMapper.map(s, StatisticsDto.class)).collect(Collectors.toSet()))
                        .build()
            );
        });
        return catalogDtos;
//        return catalogs.stream().map(c -> modelMapper.map(c, CatalogDto.class)).collect(Collectors.toList());
    }

    //사용자를 구분하기 위한 난수 생성
    @Override
    public String getUserCode() {
        String rnd = UUID.randomUUID().toString();
        return rnd;
    }
}
