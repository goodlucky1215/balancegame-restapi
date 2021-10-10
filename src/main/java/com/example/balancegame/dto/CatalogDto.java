package com.example.balancegame.dto;

import com.example.balancegame.entity.Statistics;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CatalogDto implements Serializable {
    private Long catalogId;
    private String catalogName;
    private Set<QuestionDto> questionDtos = new HashSet<>();
//    private Set<StatisticsDto> statisticsDtos = new HashSet<>();
}
