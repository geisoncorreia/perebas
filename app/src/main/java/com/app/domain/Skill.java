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
@Table(name = "skill")
@Data
public class Skill {

    @Id
    @SequenceGenerator(name = "skill_sequence", sequenceName = "skill_sequence", allocationSize = 1)
    @GeneratedValue(generator = "skill_sequence", strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
