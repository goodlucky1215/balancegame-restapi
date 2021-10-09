package com.example.balancegame.controller;

import com.example.balancegame.dto.ApiResponseDto;
import com.example.balancegame.dto.CatalogDto;
import com.example.balancegame.dto.QuestionDto;
import com.example.balancegame.entity.Question;
import com.example.balancegame.exception.BackendException;
import com.example.balancegame.service.CatalogService;
import com.example.balancegame.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/1.0/questions")
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public ApiResponseDto getAllQuestions() throws BackendException {
        try {
            return new ApiResponseDto(true, questionService.getAllQuestions(), null);
        } catch (Exception e) {
            throw new BackendException(e.getMessage());
        }
    }
}
