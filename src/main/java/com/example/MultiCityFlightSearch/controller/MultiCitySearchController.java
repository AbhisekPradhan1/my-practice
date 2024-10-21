package com.example.MultiCityFlightSearch.controller;
import com.example.MultiCityFlightSearch.module.MultiCitySearchRequest;
import com.example.MultiCityFlightSearch.module.MultiCitySearchResponse;
import com.example.MultiCityFlightSearch.service.Service.MultiCitySearchService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class MultiCitySearchController {

    private static final Logger logger = LoggerFactory.getLogger(MultiCitySearchController.class);

    private final MultiCitySearchService multiCitySearchService;

    @PostMapping("/multi")
    public ResponseEntity<MultiCitySearchResponse> SearchFlight(@RequestBody MultiCitySearchRequest multiCitySearchRequest) {
        logger.info("Received search flight request: {}", multiCitySearchRequest);

        MultiCitySearchResponse response = multiCitySearchService.SearchFlight(multiCitySearchRequest);

        if (response != null) {
            logger.info("Search flight response: {}", response);
        } else {
            logger.warn("Search flight returned null response");
        }

        return ResponseEntity.ok(response);
    }
}
