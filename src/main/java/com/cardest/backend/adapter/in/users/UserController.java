package com.cardest.backend.adapter.in.users;

import com.cardest.backend.domain.model.users.User;
import com.cardest.backend.domain.service.users.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        User user = userService.getById(id);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/users/new-user")
    public ResponseEntity<Boolean> isNewUser(@RequestParam("email") String email) {
        boolean isNewUser = userService.isNewUser(email);
        return ResponseEntity.ok().body(isNewUser);
    }

    @GetMapping("/users/user")
    public ResponseEntity<User> getUserByEmail(@RequestParam("email") String email) {
        User user = userService.getUserByEmail(email);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.create(user);
        return ResponseEntity.ok().body(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Void> updateUser(@RequestBody User user, @PathVariable("id") Long id) {
        userService.update(user, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
