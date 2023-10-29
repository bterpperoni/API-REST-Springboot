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
    private String departure;
    private Date departureDate;
    private String departureTime;
    private String destination;
    private Date destinationlDate;
    private String destinationTime;
    private double price;
    private boolean validated;

}
