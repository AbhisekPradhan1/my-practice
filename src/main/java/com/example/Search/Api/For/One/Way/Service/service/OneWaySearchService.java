package com.example.Search.Api.For.One.Way.Service.service;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchRequestDTO;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchResponseDTO;


public interface OneWaySearchService {
    OneWaySearchResponseDTO searchFlights(OneWaySearchRequestDTO request) ;
}
