package com.example.MultiCityFlightSearch.service.Impl;


import com.example.MultiCityFlightSearch.client.MultiCitySearchClient;
import com.example.MultiCityFlightSearch.module.MultiCitySearchRequest;
import com.example.MultiCityFlightSearch.module.MultiCitySearchResponse;
import com.example.MultiCityFlightSearch.service.Service.MultiCitySearchService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MultiCitySearchServiceImpl implements MultiCitySearchService {

    private static final Logger logger = LoggerFactory.getLogger(MultiCitySearchServiceImpl.class);

    @Autowired
    private MultiCitySearchClient multiCitySearchClient;

    public MultiCitySearchServiceImpl(MultiCitySearchClient multiCitySearchClient) {
        this.multiCitySearchClient = multiCitySearchClient;
    }

    @Override
    public MultiCitySearchResponse SearchFlight(MultiCitySearchRequest multiCitySearchRequest) {
        logger.info("Starting search flight with request: {}", multiCitySearchRequest);

        MultiCitySearchResponse responseDTO = multiCitySearchClient.getSearchFromTbo(multiCitySearchRequest);

        if (responseDTO != null) {
            logger.info("Search flight response received: {}", responseDTO);
        } else {
            logger.warn("Search flight returned null response");
        }

        return responseDTO;
    }
}
