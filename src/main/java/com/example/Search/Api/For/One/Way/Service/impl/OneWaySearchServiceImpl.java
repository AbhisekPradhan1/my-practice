package com.example.Search.Api.For.One.Way.Service.impl;
import com.example.Search.Api.For.One.Way.Service.service.OneWaySearchService;
import com.example.Search.Api.For.One.Way.client.TboClient;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchRequestDTO;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OneWaySearchServiceImpl implements OneWaySearchService {

    private final Logger logger = LoggerFactory.getLogger(OneWaySearchServiceImpl.class); // Logger instance
    private final TboClient tboClient;

    public OneWaySearchServiceImpl(TboClient tboClient) {
        this.tboClient = tboClient;
    }

    @Override
    public OneWaySearchResponseDTO searchFlights(OneWaySearchRequestDTO request) {
        logger.info("Searching for one-way flights with request: {}", request);
        OneWaySearchResponseDTO response = tboClient.getSearchFromTbo(request);
        logger.info("Received search response: {}", response);
        return response;
    }
}
