package dev.haguel.lab1.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String topic;
    private int durationMinutes;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}