package com.example.Search.Api.For.One.Way.client;
import com.example.Search.Api.For.One.Way.config.oneWaySearchConfig;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchRequest;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "OneWaySearchClient", url = "http://api.tektravels.com/BookingEngineService_Air/AirService.svc/rest", configuration = oneWaySearchConfig.class)
public interface OneWaySearchClient {

    Logger logger = LoggerFactory.getLogger(OneWaySearchClient.class);

    @PostMapping("/Search")
    OneWaySearchResponse getSearchFromTbo(@RequestBody OneWaySearchRequest oneWaySearchRequestDTO);



}
