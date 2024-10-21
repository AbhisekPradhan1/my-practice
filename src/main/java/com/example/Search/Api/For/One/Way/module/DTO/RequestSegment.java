package com.example.Search.Api.For.One.Way.module.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RequestSegment {

    @JsonProperty("Origin")
    private String origin;

    @JsonProperty("Destination")
    private String destination;

    @JsonProperty("FlightCabinClass")
    private String flightCabinClass;

    @JsonProperty("PreferredDepartureTime")
    private String preferredDepartureTime;

    @JsonProperty("PreferredArrivalTime")
    private String preferredArrivalTime;
}