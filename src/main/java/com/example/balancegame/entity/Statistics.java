package com.example.balancegame.entity;

import com.example.balancegame.composite.StatisticsCompositeKey;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "statistics")
public class Statistics implements Serializable {

    @EmbeddedId
    private StatisticsCompositeKey id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "catalog_id", referencedColumnName = "catalog_id", insertable = false, updatable = false)
    @MapsId("catalogId")
    private Catalog catalog;

    @Column(name = "result1", columnDefinition = "integer default 0")
    private int result1;

    @Column(name = "result2", columnDefinition = "integer default 0")
    private int result2;

    @Column(name = "result3", columnDefinition = "integer default 0")
    private int result3;

    @Column(name = "result4", columnDefinition = "integer default 0")
    private int result4;

    @Column(name = "result5", columnDefinition = "integer default 0")
    private int result5;

    @Column(name = "result6", columnDefinition = "integer default 0")
    private int result6;

    @Column(name = "result7", columnDefinition = "integer default 0")
    private int result7;

    @Column(name = "result8", columnDefinition = "integer default 0")
    private int result8;

    @Column(name = "result9", columnDefinition = "integer default 0")
    private int result9;

    @Column(name = "result10", columnDefinition = "integer default 0")
    private int result10;

    @Column(name = "result11", columnDefinition = "integer default 0")
    private int result11;

    @Column(name = "result12", columnDefinition = "integer default 0")
    private int result12;

    @Column(name = "result13", columnDefinition = "integer default 0")
    private int result13;

    @Column(name = "result14", columnDefinition = "integer default 0")
    private int result14;

    @Column(name = "result15", columnDefinition = "integer default 0")
    private int result15;

    @Column(name = "result16", columnDefinition = "integer default 0")
    private int result16;

}
