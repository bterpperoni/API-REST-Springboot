package com.cardest.backend.configuration;

import com.cardest.backend.adapter.out.mapper.destinations.TravelMapper;
import com.cardest.backend.adapter.out.persistence.destinations.TravelPersistenceAdapter;
import com.cardest.backend.adapter.out.repository.destinations.TravelRepository;
import com.cardest.backend.domain.service.destinations.TravelService;
import com.cardest.backend.port.in.TravelUseCase;
import com.cardest.backend.port.out.TravelDbUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.cardest.backend.adapter.out.repository.destinations")
public class TravelConfiguration {

    @Autowired
    public TravelRepository travelRepository;
    public TravelMapper travelMapper = new TravelMapper();
    public TravelPersistenceAdapter travelPersistenceAdapter;

    @Bean
    public TravelDbUseCase getTravelDbUseCase() {
        return new TravelPersistenceAdapter(travelRepository, travelMapper);
    }

    @Bean
    public TravelUseCase getTravelUseCase() {
        travelPersistenceAdapter = new TravelPersistenceAdapter(travelRepository, travelMapper);
        return new TravelService(travelPersistenceAdapter);
    }

}
