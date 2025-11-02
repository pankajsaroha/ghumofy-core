package com.ghumofy.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "state")
public record State(
        @Id
        String id,
        String name,
        String description,

        String country,
        String slug,
        int population,
        double areasqkm,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}
