package com.cardest.backend.domain.model.destinations;

import com.cardest.backend.domain.model.users.User;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.JsonNode;
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
    // passengers is a jsonb field
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
