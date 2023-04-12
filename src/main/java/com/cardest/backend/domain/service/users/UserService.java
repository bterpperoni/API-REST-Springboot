package com.cardest.backend.domain.service.users;

import com.cardest.backend.adapter.out.jpa.users.UserJpaEntity;
import com.cardest.backend.adapter.out.mapper.users.UserMapper;
import com.cardest.backend.adapter.out.repository.users.UserRepository;
import com.cardest.backend.domain.model.users.User;
import com.cardest.backend.domain.service.GenericService;
import com.cardest.backend.exception.RuleException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService extends GenericService<User, UserJpaEntity, UserMapper, UserRepository> {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserRepository getRepo() {
        return userRepository;
    }

    @Override
    public UserMapper getMapper() {
        return userMapper;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        List<UserJpaEntity> userJpaEntities = userRepository.findAll();
        for(UserJpaEntity userJpaEntity : userJpaEntities) {
            users.add(userMapper.toDomainEntity(userJpaEntity));
        }
        return users;
    }

    public boolean isNewUser(String email) {
        Optional<UserJpaEntity> userToGet = userRepository.findByEmail(email);
        if(userToGet.isPresent()){
            userToGet.get().setIsNew(false);
                return false;
            }
        return true;
    }

    public User getUserByEmail(String email) {
        Optional<UserJpaEntity> userToGet = userRepository.findByEmail(email);
        if(userToGet.isPresent()){
            User user = userMapper.toDomainEntity(userToGet.get());
            return user;
        }
        else{
            throw new RuleException("User not found", HttpStatus.BAD_REQUEST);
        }
    }
}
