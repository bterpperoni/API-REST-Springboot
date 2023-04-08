package com.cardest.backend.adapter.out.repository;

import com.cardest.backend.adapter.out.jpa.UserJpaEntity;
import com.cardest.backend.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserJpaEntity, Long> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */
    @Query("SELECT u FROM UserJpaEntity u WHERE u.aceNumber = :aceNumber")
    public User existsByAceNumber(String aceNumber);
}

