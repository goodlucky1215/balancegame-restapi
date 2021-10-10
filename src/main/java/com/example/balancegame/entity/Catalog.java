package com.example.balancegame.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "catalog")
public class Catalog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalog_id")
    private Long catalogId;

    @Column(name = "catalog_name", nullable = false)
    private String catalogName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catalog")
    private Set<Question> questions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catalog")
    private Set<Statistics> statistics = new HashSet<>();
}
