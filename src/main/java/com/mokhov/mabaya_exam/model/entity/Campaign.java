package com.mokhov.mabaya_exam.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.Date;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@SuperBuilder
@Entity
public class Campaign extends AbstractEntityBase {

    private String campaignName;
    private Date startDate;
    private Double bid;
    @OneToOne
    private CategoryOfProduct category;


}
