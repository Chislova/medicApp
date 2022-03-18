package com.javaSchool.dto;

import com.javaSchool.entity.enums.EventStatus;
import lombok.*;

import java.time.LocalDateTime;


@Data
public class EventDto {

    private int id;

    private PatientDto patient;

    private LocalDateTime scheduledDatetime;

    private EventStatus eventStatus;

    private TreatmentDto treatment;

    private String cancelReason;

    private int appointmentId;
}
