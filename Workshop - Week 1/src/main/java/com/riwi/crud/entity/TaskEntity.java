package com.riwi.crud.entity;

import com.riwi.crud.enums.StatusTask;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String tittle;

    @Column(length = 255, nullable = true)
    private String description;

    @Column(nullable = false)
    private LocalDate dateCreation;

    @Column(nullable = false)
    private LocalTime hourCreation;

    @Column(length = 50, nullable = false)
    private StatusTask status;

    public TaskEntity() {

    }

    public TaskEntity(Long id, String tittle, String description, LocalDate dateCreation, LocalTime hourCreation, StatusTask status) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.dateCreation = dateCreation;
        this.hourCreation = hourCreation;
        this.status = status;
    }

    public void getHourCreation(LocalDate now) {
        this.hourCreation = hourCreation;
    }

    public void getDateCreation(LocalDate now) {
        this.dateCreation = dateCreation;
    }
}
