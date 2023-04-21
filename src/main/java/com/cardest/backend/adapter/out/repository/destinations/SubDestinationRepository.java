package com.cardest.backend.adapter.out.repository.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.SubDestinationJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubDestinationRepository extends JpaRepository<SubDestinationJpaEntity, Long> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */
}
