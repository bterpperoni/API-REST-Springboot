package com.cardest.backend.adapter.out.persistence.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity;
import com.cardest.backend.adapter.out.mapper.destinations.TravelMapper;
import com.cardest.backend.adapter.out.persistence.GenericPersistenceAdapter;
import com.cardest.backend.adapter.out.repository.destinations.TravelRepository;
import com.cardest.backend.domain.model.destinations.Travel;
import com.cardest.backend.exception.RuleException;
import com.cardest.backend.port.out.TravelDbUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class TravelPersistenceAdapter extends GenericPersistenceAdapter<Travel, TravelJpaEntity, TravelMapper, TravelRepository> implements TravelDbUseCase {

    private final TravelRepository travelRepository;
    private final TravelMapper travelMapper;

    @Override
    protected TravelRepository getRepo() {
        return travelRepository;
    }

    @Override
    protected TravelMapper getMapper() {
        return travelMapper;
    }

    @Override
    public List<Travel> getAllTravels() {
        List<Travel> travels = new ArrayList<>();
        List<TravelJpaEntity> travelJpaEntities = travelRepository.findAll();
        for(TravelJpaEntity travelJpaEntity : travelJpaEntities) {
            travels.add(travelMapper.toDomain(travelJpaEntity));
        }
        return travels;
    }

    @Override
    public List<Travel> getByDriverId(Long id) {
        List<Travel> travels = new ArrayList<>();
        List<TravelJpaEntity> travelJpaEntities = travelRepository.findByDriverId(id);
        for(TravelJpaEntity travelJpaEntity : travelJpaEntities) {
            travels.add(travelMapper.toDomain(travelJpaEntity));
        }
        return travels;
    }

   /* @Override
    public Travel create(Travel travel) {
        TravelJpaEntity travelJpaEntity = travelMapper.toJpaEntity(travel);
        TravelJpaEntity travelJpaEntitySaved = travelRepository.save(travelJpaEntity);
        return travelMapper.toDomain(travelJpaEntitySaved);
    }

    @Override
    public Travel getById(Long id) {
        Optional<TravelJpaEntity> travelToGet = travelRepository.findById(id);
        if(travelToGet.isPresent()){
            return travelMapper.toDomain(travelToGet.get());
        }
        else{
            throw new RuleException("User not found", HttpStatus.BAD_REQUEST);
        }
    }
    @Override
    public void update(Travel travel, Long id) {
        Optional<TravelJpaEntity> travelToUpdate = travelRepository.findById(id);
        if (travelToUpdate.isPresent()) {
            TravelJpaEntity travelJpaEntity = travelMapper.toJpaEntity(travel);
            TravelJpaEntity createdTravel = travelRepository.save(travelJpaEntity);
            travelMapper.toDomain(createdTravel);
        } else {
            throw new RuleException("User not found", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public void delete(Long id) {
        travelRepository.deleteById(id);
    }*/
}
