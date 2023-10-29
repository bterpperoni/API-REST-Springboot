package com.cardest.backend.adapter.out.jpa.destinations;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRAVEL")
public class TravelJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DRIVER_ID")
    private int driver;


    @Column(name = "PASSENGER_ID")
    private int passenger;

    @Column(name = "CHECK_POINT", length = 50, nullable = false)
    private String checkPoint;

    @Column(name = "DEPARTURE", length = 50, nullable = false)
    private String departure;

    @Column(name = "DEPARTURE_DATE", nullable = false)
    private Date departureDate;

    @Column(name = "DEPARTURE_TIME", nullable = false)
    private String departureTime;

    @Column(name = "DESTINATION", length = 50, nullable = false)
    private String destination;

    @Column(name = "DESTINATION_DATE")
    private Date destinationDate;

    @Column(name = "DESTINATION_TIME")
    private String destinationTime;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "VALIDATED", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean validated;

}

