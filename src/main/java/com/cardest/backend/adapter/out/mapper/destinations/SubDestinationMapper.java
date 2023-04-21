package com.cardest.backend.adapter.out.mapper.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.SubDestinationJpaEntity;
import com.cardest.backend.adapter.out.mapper.GenericMapper;
import com.cardest.backend.domain.model.destinations.SubDestination;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface SubDestinationMapper extends GenericMapper<SubDestination, SubDestinationJpaEntity> {

        SubDestination toDomainEntity(SubDestinationJpaEntity subDestinationJpaEntity);

        SubDestinationJpaEntity toJpaEntity(SubDestination subDestination);


}
