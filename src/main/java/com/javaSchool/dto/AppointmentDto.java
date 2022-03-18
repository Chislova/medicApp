package com.javaSchool.dto;

import com.javaSchool.entity.enums.TreatmentType;
import lombok.*;


@Data
public class AppointmentDto {

    private int id;

    private PatientDto patient;

    private TreatmentDto treatment;

    private TreatmentType type;

    private String period;

    private String dose;

}
