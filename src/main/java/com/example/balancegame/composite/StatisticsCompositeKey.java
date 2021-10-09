package com.example.balancegame.composite;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StatisticsCompositeKey implements Serializable {
    @Column(name = "catalog_id")
    private Long catalogId; // @MapsId("catalogId")

    @Column(name = "choice")
    private int choice;
}
