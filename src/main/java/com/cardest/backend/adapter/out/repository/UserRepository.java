package com.cardest.backend.adapter.out.repository;

import com.cardest.backend.adapter.out.jpa.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserJpaEntity, Long> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */

    @Query("SELECT u FROM UserJpaEntity u WHERE u.email = :email")
    Optional<UserJpaEntity> findById(@Param("email") String email);
}

