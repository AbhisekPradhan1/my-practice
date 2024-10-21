package com.example.Search.Api.For.One.Way.Service.impl;
import com.example.Search.Api.For.One.Way.Service.service.OneWaySearchService;
import com.example.Search.Api.For.One.Way.client.OneWaySearchClient;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchRequest;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OneWaySearchServiceImpl implements OneWaySearchService {

    private final Logger logger = LoggerFactory.getLogger(OneWaySearchServiceImpl.class); // Logger instance
    private final OneWaySearchClient oneWaySearchClient;

    public OneWaySearchServiceImpl(OneWaySearchClient oneWaySearchClient, OneWaySearchClient oneWaySearchClient1) {
        this.oneWaySearchClient = oneWaySearchClient1;

    }

    @Override
    public OneWaySearchResponse searchFlights(OneWaySearchRequest request) {
        logger.info("Searching for one-way flights with request: {}", request);
        OneWaySearchResponse response = oneWaySearchClient.getSearchFromTbo(request);
        logger.info("Received search response: {}", response);
        return response;
    }
}
