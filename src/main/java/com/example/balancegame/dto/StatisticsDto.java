package com.example.balancegame.dto;

import com.example.balancegame.composite.StatisticsCompositeKey;
import com.example.balancegame.entity.Catalog;
import lombok.Data;

import java.io.Serializable;

@Data
public class StatisticsDto implements Serializable {
    private StatisticsCompositeKey id;
    private Catalog catalog;
    private int result1;
    private int result2;
    private int result3;
    private int result4;
    private int result5;
    private int result6;
    private int result7;
    private int result8;
    private int result9;
    private int result10;
    private int result11;
    private int result12;
    private int result13;
    private int result14;
    private int result15;
    private int result16;
}
