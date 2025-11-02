package com.ghumofy.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "city")
public record city (
        @Id
        String id,
        String name,
        String description,

        @Column(name = "state_id")
        String stateId,

        String pincode,
        String coordinates,

        @Column(name = "best-time-to-visit")
        String bestTimeToVisit,
        String slug,

        @Column(name = "is-capital")
        boolean isCapital,
        int population,
        double areasqkm,
        String timezone,

        @Column(name = "created_at")
        LocalDateTime createdAt,

        @Column(name = "updated_at")
        LocalDateTime updatedAt
) {}
