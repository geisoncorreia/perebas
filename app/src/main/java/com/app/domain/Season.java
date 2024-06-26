package com.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "season")
@Data
public class Season {

    @Id
    @SequenceGenerator(name = "season_sequence", sequenceName = "season_sequence", allocationSize = 1)
    @GeneratedValue(generator = "season_sequence", strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
