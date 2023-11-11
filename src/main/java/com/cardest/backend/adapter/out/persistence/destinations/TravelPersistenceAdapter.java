package com.cardest.backend.adapter.out.persistence.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity;
import com.cardest.backend.adapter.out.mapper.destinations.TravelMapper;
import com.cardest.backend.adapter.out.persistence.GenericPersistenceAdapter;
import com.cardest.backend.adapter.out.repository.destinations.TravelRepository;
import com.cardest.backend.domain.model.destinations.Travel;
import com.cardest.backend.port.out.TravelDbUseCase;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class TravelPersistenceAdapter extends GenericPersistenceAdapter<Travel, TravelJpaEntity, TravelMapper, TravelRepository> implements TravelDbUseCase {

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

    public List<Travel> getAllTravels() {
        List<Travel> travels = new ArrayList<>();
        List<TravelJpaEntity> travelJpaEntities = travelRepository.findAll();
        for(TravelJpaEntity travelJpaEntity : travelJpaEntities) {
            travels.add(travelMapper.toDomainEntity(travelJpaEntity));
        }
        return travels;
    }

}
