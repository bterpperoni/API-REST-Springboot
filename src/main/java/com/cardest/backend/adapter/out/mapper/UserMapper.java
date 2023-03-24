package com.cardest.backend.adapter.out.mapper;

import com.cardest.backend.adapter.out.jpa.UserJpaEntity;
import com.cardest.backend.domain.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends GenericMapper<User, UserJpaEntity>{

    UserJpaEntity toJpaEntity(User user);
    User toDomainEntity(UserJpaEntity userJpaEntity);
}
