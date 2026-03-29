package dev.haguel.lab1.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AuthorProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bio;
    private String portfolioUrl;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
