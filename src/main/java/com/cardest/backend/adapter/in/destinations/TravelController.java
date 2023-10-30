package com.cardest.backend.adapter.in.destinations;

import com.cardest.backend.domain.model.destinations.Travel;
import com.cardest.backend.domain.service.destinations.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class TravelController {

    private final TravelService travelService;

    @GetMapping("/travels")
    public ResponseEntity<List<Travel>> getAllTravels() {
        List<Travel> travels = travelService.getAllTravels();
        return ResponseEntity.ok().body(travels);
    }

    @PostMapping("/travels")
    public ResponseEntity<Travel> createTravel(@RequestBody Travel travel) {
        Travel travelBody = travelService.create(travel);
        return ResponseEntity.ok().body(travelBody);
    }
}
