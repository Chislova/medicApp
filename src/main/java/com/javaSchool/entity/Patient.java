package com.javaSchool.entity;

import com.javaSchool.entity.enums.PatientStatus;
import jakarta.persistence.*;
import lombok.*;

// Patient data

@Data
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int id;

    @Column(name = "patient_name")
    private String name;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "insurance_number")
    private String insuranceNumber;

    @Column(name = "doctor_name")
    private String doctorName;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "patient_status")
    private PatientStatus patientStatus;

}