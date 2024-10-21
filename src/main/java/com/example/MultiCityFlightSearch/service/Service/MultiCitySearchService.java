package com.example.MultiCityFlightSearch.service.Service;
import com.example.MultiCityFlightSearch.module.MultiCitySearchRequest;
import com.example.MultiCityFlightSearch.module.MultiCitySearchResponse;


public interface MultiCitySearchService {
    MultiCitySearchResponse SearchFlight(MultiCitySearchRequest multiCitySearchRequest);
}
