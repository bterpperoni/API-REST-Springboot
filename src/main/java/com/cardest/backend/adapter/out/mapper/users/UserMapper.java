package com.cardest.backend.adapter.out.mapper.users;

import com.cardest.backend.adapter.out.jpa.users.UserJpaEntity;
import com.cardest.backend.adapter.out.mapper.GenericMapper;
import com.cardest.backend.domain.model.users.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends GenericMapper<User, UserJpaEntity> {

    UserJpaEntity toJpaEntity(User user);
    User toDomainEntity(UserJpaEntity userJpaEntity);
}