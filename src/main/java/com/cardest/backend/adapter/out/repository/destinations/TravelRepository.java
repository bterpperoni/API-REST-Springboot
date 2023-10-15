package com.cardest.backend.adapter.out.repository.destinations;


import com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<TravelJpaEntity, Long> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */
}
