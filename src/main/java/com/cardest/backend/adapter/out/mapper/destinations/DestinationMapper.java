package com.cardest.backend.adapter.out.mapper.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.DestinationJpaEntity;
import com.cardest.backend.adapter.out.mapper.GenericMapper;
import com.cardest.backend.domain.model.destinations.Destination;
import org.mapstruct.Mapper;

@Mapper
public interface DestinationMapper extends GenericMapper<Destination, DestinationJpaEntity> {

        DestinationJpaEntity toJpaEntity(Destination destination);
        Destination toDomainEntity(DestinationJpaEntity destinationJpaEntity);
}
