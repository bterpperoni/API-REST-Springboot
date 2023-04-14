package com.cardest.backend.adapter.out.repository.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.DestinationJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DestinationRepository extends JpaRepository<DestinationJpaEntity, UUID> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */
}
