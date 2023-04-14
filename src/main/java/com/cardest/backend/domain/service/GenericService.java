package com.cardest.backend.domain.service;

import java.util.Optional;
import java.util.UUID;

import com.cardest.backend.adapter.out.mapper.GenericMapper;
import com.cardest.backend.exception.RuleException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;

public abstract class GenericService<P, E, M extends GenericMapper<P, E>, R extends JpaRepository<E, UUID>> {

    protected abstract R getRepo();

    protected abstract M getMapper();

    public UUID generateID(){
        return UUID.randomUUID();
    }

    public P getById(UUID id){
        Optional<E> objectEntity = getRepo().findById(id);
        if (objectEntity.isPresent()) {
            return getMapper().toDomainEntity(objectEntity.get());
        } else {
            throw new RuleException("object not found", HttpStatus.BAD_REQUEST);
        }
    }

    public void delete(UUID id) {
        getRepo().deleteById(id);
    }

    public P create(P object) {
        E objectEntity = getMapper().toJpaEntity(object);
        getRepo().save(objectEntity);
        return getMapper().toDomainEntity(objectEntity);
    }

    public void update(P object, UUID id) {
        Optional<E> objectToUpdate = getRepo().findById(id);
        if (objectToUpdate.isPresent()) {
            E objectEntity = getMapper().toJpaEntity(object);
            E createdObject = getRepo().save(objectEntity);
            getMapper().toDomainEntity(createdObject);
        } else {
            throw new RuleException("Object not found", HttpStatus.BAD_REQUEST);
        }
    }

}
