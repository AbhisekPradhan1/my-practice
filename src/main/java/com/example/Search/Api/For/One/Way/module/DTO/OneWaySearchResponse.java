package com.example.Search.Api.For.One.Way.module.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OneWaySearchResponse {

    @JsonProperty("Response")
    private Response response;
}
