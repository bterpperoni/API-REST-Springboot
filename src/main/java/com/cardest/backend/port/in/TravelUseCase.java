package com.cardest.backend.port.in;

import com.cardest.backend.domain.model.destinations.Travel;

import java.util.List;

public interface TravelUseCase {
    List<Travel> getAllTravels();
    Travel getById(Long id);
    void update(Travel travel, Long id);
    Travel create(Travel travel);
    void delete(Long id);
}
