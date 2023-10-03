package com.cardest.backend.adapter.out.jpa.destinations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "DESTINATIONS")
public class DestinationJpaEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;
}
