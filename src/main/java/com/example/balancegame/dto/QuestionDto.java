package com.example.balancegame.dto;

import com.example.balancegame.entity.Catalog;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class QuestionDto implements Serializable {

    private String userCode;
    private CatalogDto catalog;
    private String username;
    private int question1;
    private int question2;
    private int question3;
    private int question4;
    private int question5;
    private int question6;
    private int question7;
    private int question8;
    private int question9;
    private int question10;
    private int question11;
    private int question12;
    private int question13;
    private int question14;
    private int question15;
    private int question16;
    private Date responseDate;
    private Date expiredDate;
}
