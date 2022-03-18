package com.javaSchool.entity;

import com.javaSchool.entity.enums.TreatmentType;
import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "treatment_id")
    private Treatment treatment;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "treatment_type")
    private TreatmentType type;

    @Column(name = "period")
    private int period;

    @Column(name = "dose")
    private String dose;

}
