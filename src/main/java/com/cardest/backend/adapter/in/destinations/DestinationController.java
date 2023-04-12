package com.cardest.backend.adapter.in.destinations;

import com.cardest.backend.domain.model.destinations.Destination;
import com.cardest.backend.domain.service.destinations.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class DestinationController {

    private final DestinationService destinationService;

    @GetMapping("/destinations")
    public ResponseEntity<List<Destination>> getAllDestinations() {
        List<Destination> destinations = destinationService.getAllDestinations();
        return ResponseEntity.ok().body(destinations);
    }
}
