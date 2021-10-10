package com.example.balancegame.composite;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class StatisticsCompositeKey implements Serializable {
    @Column(name = "catalog_id", unique = false)
    private Long catalogId; // @MapsId("catalogId")

    @Column(name = "choice", unique = false)
    private int choice;
}
