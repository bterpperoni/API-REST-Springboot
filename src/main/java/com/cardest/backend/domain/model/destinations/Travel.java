package com.cardest.backend.domain.model.destinations;

import com.cardest.backend.domain.model.users.User;
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
    private String driverId;
    private String passengerId;
    private String checkPoint;
    private Date departureDate;
    private Date destinationlDate;
    private String departure;
    private String destination;
    private String distance;
    private double price;
    private boolean validated;

}
