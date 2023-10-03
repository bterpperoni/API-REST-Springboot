package com.cardest.backend.adapter.out.repository.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.DestinationJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<DestinationJpaEntity, Long> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */
}
