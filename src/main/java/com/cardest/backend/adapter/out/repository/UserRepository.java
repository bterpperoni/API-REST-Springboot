package com.cardest.backend.adapter.out.repository;

import com.cardest.backend.adapter.out.jpa.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserJpaEntity, Long> {
    /*
        Inherits from JpaRepository which contains basic CRUD SQL operations.
     */
}

