package com.example.balancegame.service;

import com.example.balancegame.dto.CatalogDto;
import com.example.balancegame.dto.QuestionDto;
import com.example.balancegame.entity.Catalog;
import com.example.balancegame.repository.CatalogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
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
        AtomicInteger index = new AtomicInteger();
        catalogs.forEach(c -> {
            catalogDtos.add(
                CatalogDto.builder()
                        .catalogId(c.getCatalogId())
                        .catalogName(c.getCatalogName())
                        .userCode(c.getQuestions().get(index.getAndIncrement()).getUserCode())
                        .build()
            );
        });
        return catalogDtos;
//        return catalogs.stream().map(c -> modelMapper.map(c, CatalogDto.class)).collect(Collectors.toList());
    }
}
