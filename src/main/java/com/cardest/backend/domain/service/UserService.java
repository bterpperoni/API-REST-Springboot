package com.cardest.backend.domain.service;

import com.cardest.backend.adapter.out.jpa.UserJpaEntity;
import com.cardest.backend.adapter.out.mapper.UserMapper;
import com.cardest.backend.adapter.out.repository.UserRepository;
import com.cardest.backend.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService extends GenericService<User, UserJpaEntity, UserMapper, UserRepository> {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        List<UserJpaEntity> userJpaEntities = userRepository.findAll();
        for(UserJpaEntity userJpaEntity : userJpaEntities) {
            users.add(userMapper.toDomainEntity(userJpaEntity));
        }
        return users;
    }

    @Override
    public UserRepository getRepo() {
        return userRepository;
    }

    @Override
    public UserMapper getMapper() {
        return userMapper;
    }

    public boolean getCurrentUser(String aceNumber) {
        Optional<User> user = Optional.ofNullable(userRepository.existsByAceNumber(aceNumber));
        if(user.isPresent()){
            return true;
        }else{
            return false;
        }
    }
}
