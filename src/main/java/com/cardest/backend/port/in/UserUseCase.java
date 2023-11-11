package com.cardest.backend.port.in;

import com.cardest.backend.domain.model.users.User;

import java.util.List;

public interface UserUseCase {
    List<User> getAllUsers();
    boolean isNewUser(String email);
    User getUserByEmail(String email);
    User getById(Long id);
    void update(User user, Long id);
    User create(User user);
    void delete(Long id);
}
