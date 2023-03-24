package com.cardest.backend.domain.service;

import com.cardest.backend.adapter.out.mapper.UserMapper;
import com.cardest.backend.adapter.out.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private UserMapper userMapper;
}
