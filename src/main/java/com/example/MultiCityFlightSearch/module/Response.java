package com.example.MultiCityFlightSearch.module;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    @JsonProperty("ResponseStatus")
    private int responseStatus;

    @JsonProperty("Error")
    private ErrorDetail error;

    @JsonProperty("TraceId")
    private String traceId;

    @JsonProperty("Origin")
    private String origin;

    @JsonProperty("Destination")
    private String destination;

    @JsonProperty("Results")
    private List<List<Result>> results;
}