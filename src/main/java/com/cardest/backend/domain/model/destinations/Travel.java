package com.cardest.backend.domain.model.destinations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Travel {

    private Long id;
    private int driverId;
    private int driverDistancePreference;
    private String passengers;
    private String departure;
    private Double departureLatitude;
    private Double departureLongitude;
    private Date departureDate;
    private String departureTime;
    private String destination;
    private Double destinationLatitude;
    private Double destinationLongitude;
    private Date destinationDate;
    private String destinationTime;
    private int status;

}
