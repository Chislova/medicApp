package com.javaSchool.dto;

import com.javaSchool.entity.enums.TreatmentType;
import lombok.*;


@Data
public class TreatmentDto {

    private int id;

    private String treatmentName;

    private TreatmentType treatmentType;

}
