package com.mokhov.mabaya_exam.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Builder
@Entity
public class Campaign extends AbstractEntityBase {

    private String campaignName;
    private LocalDate startDate;
    @OneToOne
    private CategoryOfProduct category;
    private Double bid;

}
