package com.cardest.backend.domain.model.destinations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SubDestination {

    private Long id;
    private String address;
    private String locality;
    private String zip;
    private Double latitude;
    private Double longitude;
    private String relatedDestination;

}
