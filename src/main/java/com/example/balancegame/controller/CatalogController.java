package com.example.balancegame.controller;

import com.example.balancegame.dto.ApiResponseDto;
import com.example.balancegame.dto.CatalogDto;
import com.example.balancegame.exception.BackendException;
import com.example.balancegame.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/1.0/catalogs")
public class CatalogController {

    private CatalogService catalogService;
    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping
    public ApiResponseDto getAllCatalogs() throws BackendException {
        try {
            return new ApiResponseDto(true, catalogService.getAllCatalogs(), null,catalogService.getUserCode());
        } catch (Exception e) {
            throw new BackendException(e.getMessage());
        }
    }
}
