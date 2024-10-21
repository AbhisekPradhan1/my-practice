package com.example.Search.Api.For.One.Way.Service.service;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchRequest;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchResponse;

public interface OneWaySearchService {
    OneWaySearchResponse searchFlights(OneWaySearchRequest request) ;
}
