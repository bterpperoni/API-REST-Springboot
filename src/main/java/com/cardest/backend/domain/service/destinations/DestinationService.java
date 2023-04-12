package com.cardest.backend.domain.service.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.DestinationJpaEntity;
import com.cardest.backend.adapter.out.mapper.destinations.DestinationMapper;
import com.cardest.backend.adapter.out.repository.destinations.DestinationRepository;
import com.cardest.backend.domain.model.destinations.Destination;
import com.cardest.backend.domain.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinationService extends GenericService<Destination, DestinationJpaEntity, DestinationMapper, DestinationRepository> {

    private final DestinationRepository destinationRepository;
    private final DestinationMapper destinationMapper;
    @Override
    protected DestinationRepository getRepo() {
        return destinationRepository;
    }

    @Override
    protected DestinationMapper getMapper() {
        return destinationMapper;
    }

    public List<Destination> getAllDestinations() {
        List<Destination> destinations = new ArrayList<>();
        List<DestinationJpaEntity> destinationJpaEntities = destinationRepository.findAll();
        for(DestinationJpaEntity destinationJpaEntity : destinationJpaEntities) {
            destinations.add(destinationMapper.toDomainEntity(destinationJpaEntity));
        }
        return destinations;
    }
}
