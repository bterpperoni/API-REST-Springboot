package com.cardest.backend.adapter.out.jpa.destinations;

import com.cardest.backend.domain.model.destinations.Destination;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "SUB_DESTINATIONS")
public class SubDestinationJpaEntity {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "LOCALITY")
    private String locality;

    @Column(name = "ZIP")
    private String zip;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "RELATED_USER")
    private Long relatedDestination;

}
