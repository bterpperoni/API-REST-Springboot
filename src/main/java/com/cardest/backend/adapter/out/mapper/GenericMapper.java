package com.cardest.backend.adapter.out.mapper;

public interface GenericMapper<P, E> {

        E toJpaEntity(P p);

        P toDomainEntity(E e);
}
