package com.cardest.backend.domain.service.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity;
import com.cardest.backend.adapter.out.mapper.destinations.TravelMapper;
import com.cardest.backend.adapter.out.repository.destinations.TravelRepository;
import com.cardest.backend.domain.model.destinations.Travel;
import com.cardest.backend.domain.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TravelService extends GenericService<Travel, TravelJpaEntity, TravelMapper, TravelRepository> {

    private final TravelRepository travelRepository;
    private final TravelMapper travelMapper;
    @Override
    protected TravelRepository getRepo() {
        return travelRepository;
    }

    @Override
    protected TravelMapper getMapper() {
        return travelMapper;
    }
}
