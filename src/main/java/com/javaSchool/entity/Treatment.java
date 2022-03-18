package com.javaSchool.entity;

import com.javaSchool.entity.enums.TreatmentType;
import jakarta.persistence.*;
import lombok.Data;

// Remedy type and name

@Data
@Entity
@Table(name = "treatments")
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "treatment_id")
    private int id;

    @Column(name = "treatment_name")
    private String treatmentName;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "treatment_type")
    private TreatmentType treatmentType;

}

