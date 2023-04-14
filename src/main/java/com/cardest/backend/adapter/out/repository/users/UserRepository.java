package com.cardest.backend.adapter.out.repository.users;

import com.cardest.backend.adapter.out.jpa.users.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserJpaEntity, UUID> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */

    @Query("SELECT u FROM UserJpaEntity u WHERE u.email = :email")
    Optional<UserJpaEntity> findByEmail(@Param("email") String email);
}

