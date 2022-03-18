package com.javaSchool.entity;

import com.javaSchool.entity.enums.EventStatus;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Column(name = "scheduled_date_time")
    private LocalDateTime scheduledDatetime;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "event_status")
    private EventStatus eventStatus;

    @OneToOne
    @JoinColumn(name = "treatment_id")
    private Treatment treatment;

    @Column(name = "cancel_reason")
    private String cancelReason;

    @Column(name = "appointment_id")
    private int appointmentId;

}
