package com.example.Search.Api.For.One.Way.client;


import com.example.Search.Api.For.One.Way.config.FeignConfig;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchRequestDTO;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchResponseDTO;

import feign.Client;
import feign.httpclient.ApacheHttpClient;
import org.apache.http.impl.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

@FeignClient(name = "tbo-flight-client", url = "http://api.tektravels.com/BookingEngineService_Air/AirService.svc/rest", configuration = FeignConfig.class)
public interface TboClient {

    Logger logger = LoggerFactory.getLogger(TboClient.class); // Logger instance

    @PostMapping("/Search")
    OneWaySearchResponseDTO getSearchFromTbo(@RequestBody OneWaySearchRequestDTO oneWaySearchRequestDTO);



}
