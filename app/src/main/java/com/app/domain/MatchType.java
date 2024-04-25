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
@Table(name = "match_type")
@Data
public class MatchType {

    @Id
    @SequenceGenerator(name = "match_type_sequence", sequenceName = "match_type_sequence", allocationSize = 1)
    @GeneratedValue(generator = "match_type_sequence", strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
