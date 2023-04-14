package com.cardest.backend.domain.model.destinations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Destination {

    private UUID id;
    private String name;
    private String address;
    private String locality;
    private String zip;
    private Double latitude;
    private Double longitude;
}
