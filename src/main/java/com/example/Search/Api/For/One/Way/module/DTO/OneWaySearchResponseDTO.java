package com.example.Search.Api.For.One.Way.module.DTO;
import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
public class OneWaySearchResponseDTO {


    @JsonProperty("Response")
    private Response response;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response {

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

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ErrorDetail {

        @JsonProperty("ErrorCode")
        private int errorCode;

        @JsonProperty("ErrorMessage")
        private String errorMessage;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Result {

        @JsonProperty("ResultIndex")
        private String resultIndex;

        @JsonProperty("Source")
        private int source;

        @JsonProperty("IsLCC")
        private boolean isLCC;

        @JsonProperty("IsRefundable")
        private boolean isRefundable;

        @JsonProperty("AirlineRemark")
        private String airlineRemark;

        @JsonProperty("Fare")
        private Fare fare;

        @JsonProperty("FareBreakdown")
        private List<FareBreakdown> fareBreakdown;

        @JsonProperty("Segments")
        private List<List<Segment>> segments;

        @JsonProperty("LastTicketDate")
        private String lastTicketDate;

        @JsonProperty("TicketAdvisory")
        private String ticketAdvisory;

        @JsonProperty("FareRules")
        private List<FareRule> fareRules;

        @JsonProperty("AirlineCode")
        private String airlineCode;

        @JsonProperty("ValidatingAirline")
        private String validatingAirline;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Fare {

        @JsonProperty("Currency")
        private String currency;

        @JsonProperty("BaseFare")
        private double baseFare;

        @JsonProperty("Tax")
        private double tax;

        @JsonProperty("YQTax")
        private double yqTax;

        @JsonProperty("AdditionalTxnFeeOfrd")
        private double additionalTxnFeeOfrd;

        @JsonProperty("AdditionalTxnFeePub")
        private double additionalTxnFeePub;

        @JsonProperty("OtherCharges")
        private double otherCharges;

        @JsonProperty("ChargeBU")
        private List<ChargeBU> chargeBU;

        @JsonProperty("Discount")
        private double discount;

        @JsonProperty("PublishedFare")
        private double publishedFare;

        @JsonProperty("CommissionEarned")
        private double commissionEarned;

        @JsonProperty("PLBEarned")
        private double plbEarned;

        @JsonProperty("IncentiveEarned")
        private double incentiveEarned;

        @JsonProperty("OfferedFare")
        private double offeredFare;

        @JsonProperty("TdsOnCommission")
        private double tdsOnCommission;

        @JsonProperty("TdsOnPLB")
        private double tdsOnPLB;

        @JsonProperty("TdsOnIncentive")
        private double tdsOnIncentive;

        @JsonProperty("ServiceFee")
        private double serviceFee;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ChargeBU {

        @JsonProperty("key")
        private String key;

        @JsonProperty("value")
        private double value;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class FareBreakdown {

        @JsonProperty("Currency")
        private String currency;

        @JsonProperty("PassengerType")
        private int passengerType;

        @JsonProperty("PassengerCount")
        private int passengerCount;

        @JsonProperty("BaseFare")
        private double baseFare;

        @JsonProperty("Tax")
        private double tax;

        @JsonProperty("YQTax")
        private double yqTax;

        @JsonProperty("AdditionalTxnFeeOfrd")
        private double additionalTxnFeeOfrd;

        @JsonProperty("AdditionalTxnFeePub")
        private double additionalTxnFeePub;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Segment {

        @JsonProperty("TripIndicator")
        private int tripIndicator;

        @JsonProperty("SegmentIndicator")
        private int segmentIndicator;

        @JsonProperty("Airline")
        private Airline airline;

        @JsonProperty("Origin")
        private AirportDetail origin;

        @JsonProperty("Destination")
        private AirportDetail destination;

        @JsonProperty("Duration")
        private int duration;

        @JsonProperty("GroundTime")
        private int groundTime;

        @JsonProperty("Mile")
        private int mile;

        @JsonProperty("StopOver")
        private boolean stopOver;

        @JsonProperty("StopPoint")
        private String stopPoint;

        @JsonProperty("StopPointArrivalTime")
        private String stopPointArrivalTime;

        @JsonProperty("StopPointDepartureTime")
        private String stopPointDepartureTime;

        @JsonProperty("Craft")
        private String craft;

        @JsonProperty("IsETicketEligible")
        private boolean isETicketEligible;

        @JsonProperty("FlightStatus")
        private String flightStatus;

        @JsonProperty("Status")
        private String status;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Airline {

        @JsonProperty("AirlineCode")
        private String airlineCode;

        @JsonProperty("AirlineName")
        private String airlineName;

        @JsonProperty("FlightNumber")
        private String flightNumber;

        @JsonProperty("FareClass")
        private String fareClass;

        @JsonProperty("OperatingCarrier")
        private String operatingCarrier;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AirportDetail {

        @JsonProperty("Airport")
        private Airport airport;

        @JsonProperty("DepTime")
        private String depTime;

        @JsonProperty("ArrTime")
        private String arrTime;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Airport {

        @JsonProperty("AirportCode")
        private String airportCode;

        @JsonProperty("AirportName")
        private String airportName;

        @JsonProperty("Terminal")
        private String terminal;

        @JsonProperty("CityCode")
        private String cityCode;

        @JsonProperty("CityName")
        private String cityName;

        @JsonProperty("CountryCode")
        private String countryCode;

        @JsonProperty("CountryName")
        private String countryName;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class FareRule {

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
}