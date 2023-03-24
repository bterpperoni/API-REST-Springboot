package com.cardest.backend.adapter.out;

import com.cardest.backend.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserJpaEntity toJpaEntity(User user);
    User toDomainEntity(UserJpaEntity userJpaEntity);
}
