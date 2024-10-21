package com.example.MultiCityFlightSearch.module;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class MultiCitySearchResponse {

    @JsonProperty("Response")
    private Response response;

}