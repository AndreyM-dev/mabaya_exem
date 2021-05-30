package com.mokhov.mabaya_exam.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Builder
@Entity
public class CategoryOfProduct extends AbstractEntityBase {

    private String category;
}
