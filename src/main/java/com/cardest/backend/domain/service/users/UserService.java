package com.cardest.backend.domain.service.users;

import com.cardest.backend.domain.model.users.User;
import com.cardest.backend.port.in.UserUseCase;
import com.cardest.backend.port.out.UserDbUseCase;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.util.List;



@RequiredArgsConstructor
public class UserService implements UserUseCase {

    @Getter
    private final UserDbUseCase userDbUseCase;

    @Override
    public List<User> getAllUsers() {
        return getUserDbUseCase().getAllUsers();
    }

    @Override
    public boolean isNewUser(String email) {
        return getUserDbUseCase().isNewUser(email);
    }

    @Override
    public User getUserByEmail(String email) {
        return getUserDbUseCase().getUserByEmail(email);
    }

    @Override
    public User getById(Long id) {
        return getUserDbUseCase().getById(id);
    }

    @Override
    public void update(User user, Long id) {
        getUserDbUseCase().update(user, id);
    }

    @Override
    public User create(User user) {
        return getUserDbUseCase().create(user);
    }

    @Override
    public void delete(Long id) {
        getUserDbUseCase().delete(id);
    }
}
