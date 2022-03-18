package com.javaSchool.dto;

import com.javaSchool.entity.enums.PatientStatus;
import lombok.*;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class PatientDto {

    private int id;

    @Size(max = 50)
    private String name;

    @Size(max = 100)
    private String diagnosis;

    @Pattern(regexp = "[0-9]{4}-[0-9]{4}-[0-9]{4}$")
    private String insuranceNumber;

    private String doctorName;

    private PatientStatus patientStatus;
}
