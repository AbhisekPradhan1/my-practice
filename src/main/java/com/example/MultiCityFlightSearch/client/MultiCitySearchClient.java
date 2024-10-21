package com.example.MultiCityFlightSearch.client;
import com.example.MultiCityFlightSearch.config.MultiCitySearchConfig;
import com.example.MultiCityFlightSearch.module.MultiCitySearchRequest;
import com.example.MultiCityFlightSearch.module.MultiCitySearchResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="MultiCitySearchClient",url="http://api.tektravels.com/BookingEngineService_Air/AirService.svc/rest",configuration = MultiCitySearchConfig.class)
public interface MultiCitySearchClient {

   @PostMapping("/Search")
   MultiCitySearchResponse getSearchFromTbo(MultiCitySearchRequest multiCitySearchRequest);

}
