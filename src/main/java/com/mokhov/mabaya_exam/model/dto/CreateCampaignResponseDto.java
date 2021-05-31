package com.mokhov.mabaya_exam.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@AllArgsConstructor
@Data
@Builder
public class CreateCampaignResponseDto {

    private Long id;
    private String name;
    private LocalDate startDate;
    private String category;
    private Double bid;
}

