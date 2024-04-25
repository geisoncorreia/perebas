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
@Table(name = "awards")
@Data
public class Award {

    @Id
    @SequenceGenerator(name = "award_sequence", sequenceName = "award_sequence", allocationSize = 1)
    @GeneratedValue(generator = "award_sequence", strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
