package com.cardest.backend.domain.service.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity;
import com.cardest.backend.adapter.out.mapper.destinations.TravelMapper;
import com.cardest.backend.adapter.out.repository.destinations.TravelRepository;
import com.cardest.backend.domain.model.destinations.Travel;
import com.cardest.backend.domain.service.GenericService;
import com.cardest.backend.port.in.TravelUseCase;
import com.cardest.backend.port.out.TravelDbUseCase;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
public class TravelService implements TravelUseCase {

    @Getter
    private final TravelDbUseCase travelDbUseCase;

    @Override
    public List<Travel> getAllTravels() {
        return getTravelDbUseCase().getAllTravels();
    }

    @Override
    public Travel getById(Long id) {
        return getTravelDbUseCase().getById(id);
    }

    @Override
    public void update(Travel travel, Long id) {
        getTravelDbUseCase().update(travel, id);
    }

    @Override
    public Travel create(Travel travel) {
        return getTravelDbUseCase().create(travel);
    }

    @Override
    public void delete(Long id) {
        getTravelDbUseCase().delete(id);
    }
}
