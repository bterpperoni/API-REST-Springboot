package com.cardest.backend.adapter.out.mapper.users;

import com.cardest.backend.adapter.out.jpa.users.UserJpaEntity;
import com.cardest.backend.domain.model.users.User;


public class UserMapper {

    public User toDomain(UserJpaEntity userJpaEntity) {
        User user = new User();
        user.setId(userJpaEntity.getId());
        user.setUsername(userJpaEntity.getUsername());
        user.setFirstName(userJpaEntity.getFirstName());
        user.setFamilyName(userJpaEntity.getFamilyName());
        user.setEmail(userJpaEntity.getEmail());
        user.setBirthDate(userJpaEntity.getBirthDate());
        user.setAddress(userJpaEntity.getAddress());
        user.setLocality(userJpaEntity.getLocality());
        user.setZip(userJpaEntity.getZip());
        user.setNew(userJpaEntity.isNew());
        return user;
    }

    public UserJpaEntity toJpaEntity(User user) {
        UserJpaEntity userJpaEntity = new UserJpaEntity();
        userJpaEntity.setId(user.getId());
        userJpaEntity.setUsername(user.getUsername());
        userJpaEntity.setFirstName(user.getFirstName());
        userJpaEntity.setFamilyName(user.getFamilyName());
        userJpaEntity.setEmail(user.getEmail());
        userJpaEntity.setBirthDate(new java.sql.Date(user.getBirthDate().getTime()));
        userJpaEntity.setAddress(user.getAddress());
        userJpaEntity.setLocality(user.getLocality());
        userJpaEntity.setZip(user.getZip());
        userJpaEntity.setNew(user.isNew());
        return userJpaEntity;
    }
}