package com.cardest.backend.adapter.in.destinations;

import com.cardest.backend.domain.service.destinations.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class TravelController {

    private final TravelService travelService;
}
