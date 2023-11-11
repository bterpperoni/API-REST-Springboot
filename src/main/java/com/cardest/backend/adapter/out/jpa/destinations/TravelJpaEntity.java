package com.cardest.backend.adapter.out.jpa.destinations;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "TRAVELS")
public class TravelJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DRIVER_ID")
    private int driver;

    @Column(name = "PASSENGERS", columnDefinition = "jsonb")
    private String passengers;

    @Column(name = "DEPARTURE", length = 50, nullable = false)
    private String departure;

    @Column(name = "DEPARTURE_LATITUDE")
    private Double departureLatitude;

    @Column(name = "DEPARTURE_LONGITUDE")
    private Double departureLongitude;

    @Column(name = "DEPARTURE_DATE", nullable = false)
    private Date departureDate;

    @Column(name = "DEPARTURE_TIME", nullable = false)
    private String departureTime;

    @Column(name = "DESTINATION", length = 50, nullable = false)
    private String destination;

    @Column(name = "DESTINATION_LONGITUDE")
    private Double destinationLatitude;

    @Column(name = "DESTINATION_LATITUDE")
    private Double destinationLongitude;

    @Column(name = "DESTINATION_DATE")
    private Date destinationDate;

    @Column(name = "DESTINATION_TIME")
    private String destinationTime;

    @Column(name = "STATUS")
    private int status;

}

