package com.example.balancegame.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "question")
public class Question {

    @Id
    @Column(name = "user_code")
    private String userCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalog_id", nullable = false)
    private Catalog catalog;

    @Column(name = "username")
    private String username;

    @Column(name = "question1", length = 1)
    private int question1;

    @Column(name = "question2", length = 1)
    private int question2;

    @Column(name = "question3", length = 1)
    private int question3;

    @Column(name = "question4", length = 1)
    private int question4;

    @Column(name = "question5", length = 1)
    private int question5;

    @Column(name = "question6", length = 1)
    private int question6;

    @Column(name = "question7", length = 1)
    private int question7;

    @Column(name = "question8", length = 1)
    private int question8;

    @Column(name = "question9", length = 1)
    private int question9;

    @Column(name = "question10", length = 1)
    private int question10;

    @Column(name = "question11", length = 1)
    private int question11;

    @Column(name = "question12", length = 1)
    private int question12;

    @Column(name = "question13", length = 1)
    private int question13;

    @Column(name = "question14", length = 1)
    private int question14;

    @Column(name = "question15", length = 1)
    private int question15;

    @Column(name = "question16", length = 1)
    private int question16;

    @Column(name = "response_date", nullable = true)
    @CreationTimestamp
    private Date responseDate;

    @Column(name = "expired_date", nullable = true)
    private Date expiredDate;
}
