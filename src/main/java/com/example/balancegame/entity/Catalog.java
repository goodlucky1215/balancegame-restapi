package com.example.balancegame.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity(name = "catalog")
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalog_id")
    private Long catalogId;

    @Column(name = "catalog_name", nullable = false)
    private String catalogName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catalog")
    private List<Question> questions = new ArrayList<>();

//    @OneToOne
//    @PrimaryKeyJoinColumn
//    private Statistics statistics;
}
