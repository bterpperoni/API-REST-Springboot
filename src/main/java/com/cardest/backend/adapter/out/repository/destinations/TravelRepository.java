package com.cardest.backend.adapter.out.repository.destinations;


import com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TravelRepository extends JpaRepository<TravelJpaEntity, Long> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */

    @Query("SELECT t FROM TravelJpaEntity t WHERE t.driverId = :driverId")
    List<TravelJpaEntity> findByDriverId(Long driverId);
}
