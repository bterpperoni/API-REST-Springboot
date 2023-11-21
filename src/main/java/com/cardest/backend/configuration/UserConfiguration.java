package com.cardest.backend.configuration;

import com.cardest.backend.adapter.out.mapper.users.UserMapper;
import com.cardest.backend.adapter.out.mapper.users.UserMapperImpl;
import com.cardest.backend.adapter.out.persistence.users.UserPersistenceAdapter;
import com.cardest.backend.adapter.out.repository.users.UserRepository;
import com.cardest.backend.domain.service.users.UserService;
import com.cardest.backend.port.in.UserUseCase;
import com.cardest.backend.port.out.UserDbUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.cardest.backend.adapter.out.repository.users")
public class UserConfiguration {

    @Autowired
    public UserRepository userRepository;
    public UserMapper userMapper = new UserMapperImpl();
    public UserPersistenceAdapter userPersistenceAdapter;

    @Bean
    public UserDbUseCase getUserDbUseCase() {
        return new UserPersistenceAdapter(userRepository, userMapper);
    }

    @Bean
    public UserUseCase getUserUseCase() {
        userPersistenceAdapter = new UserPersistenceAdapter(userRepository, userMapper);
        return new UserService(userPersistenceAdapter);
    }
}
