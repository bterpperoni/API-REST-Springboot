package com.cardest.backend.adapter.out.mapper.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity;
import com.cardest.backend.adapter.out.mapper.GenericMapper;
import com.cardest.backend.domain.model.destinations.Travel;
import org.mapstruct.Mapper;

@Mapper
public interface TravelMapper extends GenericMapper<Travel, TravelJpaEntity> {
    com.cardest.backend.domain.model.destinations.Travel toDomain(com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity travelJpaEntity);

    com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity toJpaEntity(com.cardest.backend.domain.model.destinations.Travel travel);
}
