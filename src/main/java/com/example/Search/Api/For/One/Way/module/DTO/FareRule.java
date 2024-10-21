package com.example.Search.Api.For.One.Way.module.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FareRule {

    @JsonProperty("Origin")
    private String origin;

    @JsonProperty("Destination")
    private String destination;

    @JsonProperty("Airline")
    private String airline;

    @JsonProperty("FareBasisCode")
    private String fareBasisCode;

    @JsonProperty("FareRuleDetail")
    private String fareRuleDetail;

    @JsonProperty("FareRestriction")
    private String fareRestriction;
}
