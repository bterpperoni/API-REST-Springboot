package com.cardest.backend.port.out;

import com.cardest.backend.domain.model.destinations.Travel;

import java.util.List;

public interface TravelDbUseCase {
    List<Travel> getAllTravels();
    Travel getById(Long id);
    Travel getByDriverId(Long id);
    void update(Travel travel, Long id);
    Travel create(Travel travel);
    void delete(Long id);
}
