package com.mokhov.mabaya_exam.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Data
@Builder
public class CreateCampaignResponseDto {

    private Long id;
    private String name;
    private Date startDate;
    private String category;
    private Double bid;
}

