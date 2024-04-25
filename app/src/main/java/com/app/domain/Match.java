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
@Table(name = "match")
@Data
public class Match {

    @Id
    @SequenceGenerator(name = "match_sequence", sequenceName = "match_sequence", allocationSize = 1)
    @GeneratedValue(generator = "match_sequence", strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
