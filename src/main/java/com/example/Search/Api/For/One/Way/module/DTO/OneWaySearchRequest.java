package com.example.Search.Api.For.One.Way.module.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class OneWaySearchRequest {

    @JsonProperty("EndUserIp")
    private String endUserIp;

    @JsonProperty("TokenId")
    private String tokenId;

    @JsonProperty("AdultCount")
    private String adultCount;

    @JsonProperty("ChildCount")
    private String childCount;

    @JsonProperty("InfantCount")
    private String infantCount;

    @JsonProperty("DirectFlight")
    private String directFlight;

    @JsonProperty("OneStopFlight")
    private String oneStopFlight;

    @JsonProperty("JourneyType")
    private String journeyType;

    @JsonProperty("PreferredAirlines")
    private String preferredAirlines;

    @JsonProperty("Segments")
    private List<RequestSegment> segments;

    @JsonProperty("Sources")
    private String sources;
}