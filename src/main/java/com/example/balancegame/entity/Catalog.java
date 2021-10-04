package com.example.balancegame.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "catalog")
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalog_id")
    private Long catalogId;

    @Column(name = "catalog_name", nullable = false)
    private String catalogName;
}
