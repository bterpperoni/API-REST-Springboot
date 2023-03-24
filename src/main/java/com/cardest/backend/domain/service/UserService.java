package com.cardest.backend.domain.service;

import com.cardest.backend.adapter.out.jpa.UserJpaEntity;
import com.cardest.backend.adapter.out.mapper.UserMapper;
import com.cardest.backend.adapter.out.repository.UserRepository;
import com.cardest.backend.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

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
}
