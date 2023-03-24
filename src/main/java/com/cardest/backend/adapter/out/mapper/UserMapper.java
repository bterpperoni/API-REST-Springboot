package com.cardest.backend.adapter.out.mapper;

import com.cardest.backend.adapter.out.jpa.UserJpaEntity;
import com.cardest.backend.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserJpaEntity toJpaEntity(User user);
    User toDomainEntity(UserJpaEntity userJpaEntity);
}
