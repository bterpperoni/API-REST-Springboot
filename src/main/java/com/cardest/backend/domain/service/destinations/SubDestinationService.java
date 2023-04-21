package com.cardest.backend.domain.service.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.SubDestinationJpaEntity;
import com.cardest.backend.adapter.out.mapper.destinations.SubDestinationMapper;
import com.cardest.backend.adapter.out.repository.destinations.SubDestinationRepository;
import com.cardest.backend.domain.model.destinations.SubDestination;
import com.cardest.backend.domain.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubDestinationService extends GenericService<SubDestination, SubDestinationJpaEntity, SubDestinationMapper, SubDestinationRepository> {

    private final SubDestinationRepository subDestinationRepository;
    private final SubDestinationMapper subDestinationMapper;

    @Override
    protected SubDestinationRepository getRepo() {
        return subDestinationRepository;
    }

    @Override
    protected SubDestinationMapper getMapper() {
        return subDestinationMapper;
    }
}
