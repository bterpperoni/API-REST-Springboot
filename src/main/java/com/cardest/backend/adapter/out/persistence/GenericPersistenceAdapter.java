package com.cardest.backend.adapter.out.persistence;

import com.cardest.backend.adapter.out.mapper.GenericMapper;
import com.cardest.backend.exception.RuleException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;

import java.util.Optional;

public abstract class GenericPersistenceAdapter<P, E, M extends GenericMapper<P, E>, R extends JpaRepository<E, Long>> {

    protected abstract R getRepo();

    protected abstract M getMapper();

    public P getById(Long id){
        Optional<E> objectEntity = getRepo().findById(id);
        if (objectEntity.isPresent()) {
            return getMapper().toDomain(objectEntity.get());
        } else {
            throw new RuleException("object not found", HttpStatus.BAD_REQUEST);
        }
    }

    public void delete(Long id) {
        getRepo().deleteById(id);
    }

    public P create(P object) {
        E objectEntity = getMapper().toJpaEntity(object);
        getRepo().save(objectEntity);
        return getMapper().toDomain(objectEntity);
    }

    public void update(P object, Long id) {
        Optional<E> objectToUpdate = getRepo().findById(id);
        if (objectToUpdate.isPresent()) {
            E objectEntity = getMapper().toJpaEntity(object);
            E createdObject = getRepo().save(objectEntity);
            getMapper().toDomain(createdObject);
        } else {
            throw new RuleException("Object not found", HttpStatus.BAD_REQUEST);
        }
    }
}