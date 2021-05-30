package com.mokhov.mabaya_exam.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class CreateCampaignRequestDto {

    private String name;
    private LocalDate startDate;
    private String category;
    private Double bid;
}
