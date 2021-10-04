package com.example.balancegame.service;

import com.example.balancegame.dto.CatalogDto;
import com.example.balancegame.entity.Catalog;
import com.example.balancegame.repository.CatalogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        return catalogs.stream().map(c -> modelMapper.map(c, CatalogDto.class)).collect(Collectors.toList());
    }
}
