package com.cardest.backend.adapter.out.mapper.destinations;

import com.cardest.backend.adapter.out.jpa.destinations.TravelJpaEntity;
import com.cardest.backend.domain.model.destinations.Travel;


public class TravelMapper {

    public Travel toDomain(TravelJpaEntity travelJpaEntity) {
        Travel travel = new Travel();
        travel.setId(travelJpaEntity.getId());
        travel.setDriverId(travelJpaEntity.getDriverId());
        travel.setPassengers(travelJpaEntity.getPassengers());
        travel.setDeparture(travelJpaEntity.getDeparture());
        travel.setDepartureLatitude(travelJpaEntity.getDepartureLatitude());
        travel.setDepartureLongitude(travelJpaEntity.getDepartureLongitude());
        travel.setDepartureDate(travelJpaEntity.getDepartureDate());
        travel.setDepartureTime(travelJpaEntity.getDepartureTime());
        travel.setDestination(travelJpaEntity.getDestination());
        travel.setDestinationLatitude(travelJpaEntity.getDestinationLatitude());
        travel.setDestinationLongitude(travelJpaEntity.getDestinationLongitude());
        travel.setDestinationDate(travelJpaEntity.getDestinationDate());
        travel.setDestinationTime(travelJpaEntity.getDestinationTime());
        travel.setStatus(travelJpaEntity.getStatus());
        return travel;
    }

    public TravelJpaEntity toJpaEntity(Travel travel) {
        TravelJpaEntity travelJpaEntity = new TravelJpaEntity();
        travelJpaEntity.setId(travel.getId());
        travelJpaEntity.setDriverId(travel.getDriverId());
        travelJpaEntity.setPassengers(travel.getPassengers());
        travelJpaEntity.setDeparture(travel.getDeparture());
        travelJpaEntity.setDepartureLatitude(travel.getDepartureLatitude());
        travelJpaEntity.setDepartureLongitude(travel.getDepartureLongitude());
        travelJpaEntity.setDepartureDate(travel.getDepartureDate());
        travelJpaEntity.setDepartureTime(travel.getDepartureTime());
        travelJpaEntity.setDestination(travel.getDestination());
        travelJpaEntity.setDestinationLatitude(travel.getDestinationLatitude());
        travelJpaEntity.setDestinationLongitude(travel.getDestinationLongitude());
        travelJpaEntity.setDestinationDate(travel.getDestinationDate());
        travelJpaEntity.setDestinationTime(travel.getDestinationTime());
        travelJpaEntity.setStatus(travel.getStatus());
        return travelJpaEntity;
    }
}
