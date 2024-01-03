package com.cardest.backend.adapter.in.destinations;

import com.cardest.backend.domain.model.destinations.Travel;
import com.cardest.backend.domain.service.destinations.TravelService;
import com.cardest.backend.port.in.TravelUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class TravelController {

    private final TravelUseCase travelService;

    @GetMapping("/travels")
    public ResponseEntity<List<Travel>> getAllTravels() {
        List<Travel> travels = travelService.getAllTravels();
        return ResponseEntity.ok().body(travels);
    }

    @GetMapping("/travels/{id}")
    public ResponseEntity<Travel> getTravelById(@PathVariable("id") Long id) {
        Travel travel = travelService.getById(id);
        return ResponseEntity.ok().body(travel);
    }

    @GetMapping("/travels/driver/{id}")
    public ResponseEntity<List<Travel>> getTravelByDriverId(@PathVariable("id") Long id) {
        List<Travel> travels = travelService.getByDriverId(id);
        return ResponseEntity.ok().body(travels);
    }

    @PostMapping("/travels")
    public ResponseEntity<Travel> createTravel(@RequestBody Travel travel) {
        Travel travelBody = travelService.create(travel);
        return ResponseEntity.ok().body(travelBody);
    }

    @PutMapping("/travels/{id}")
    public ResponseEntity<Void> updateTravel(@RequestBody Travel travel, @PathVariable("id") Long id) {
        travelService.update(travel, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/travels/{id}")
    public ResponseEntity<Void> deleteTravel(@PathVariable("id") Long id) {
        travelService.delete(id);
        return ResponseEntity.ok().build();
    }


}
