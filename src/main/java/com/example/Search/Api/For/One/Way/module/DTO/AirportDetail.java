package com.example.Search.Api.For.One.Way.module.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportDetail {

    @JsonProperty("Airport")
    private Airport airport;

    @JsonProperty("DepTime")
    private String depTime;

    @JsonProperty("ArrTime")
    private String arrTime;
}