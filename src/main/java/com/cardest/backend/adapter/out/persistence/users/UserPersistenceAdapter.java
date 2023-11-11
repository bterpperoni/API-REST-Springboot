package com.cardest.backend.adapter.out.persistence.users;

import com.cardest.backend.adapter.out.jpa.users.UserJpaEntity;
import com.cardest.backend.adapter.out.mapper.users.UserMapper;
import com.cardest.backend.adapter.out.persistence.GenericPersistenceAdapter;
import com.cardest.backend.adapter.out.repository.users.UserRepository;
import com.cardest.backend.domain.model.users.User;
import com.cardest.backend.exception.RuleException;
import com.cardest.backend.port.out.UserDbUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class UserPersistenceAdapter extends GenericPersistenceAdapter<User, UserJpaEntity, UserMapper, UserRepository> implements UserDbUseCase {

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

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        List<UserJpaEntity> userJpaEntities = userRepository.findAll();
        for(UserJpaEntity userJpaEntity : userJpaEntities) {
            users.add(userMapper.toDomainEntity(userJpaEntity));
        }
        return users;
    }

    @Override
    public boolean isNewUser(String email) {
        Optional<UserJpaEntity> userToGet = userRepository.findByEmail(email);
        if(userToGet.isPresent()){
            return false;
        }
        return true;
    }

    @Override
    public User getUserByEmail(String email) {
        Optional<UserJpaEntity> userToGet = userRepository.findByEmail(email);
        if(userToGet.isPresent()){
            return userMapper.toDomainEntity(userToGet.get());
        }
        else{
            throw new RuleException("User not found", HttpStatus.BAD_REQUEST);
        }
    }

}
