package com.Flight_Book.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookResponse {

    @JsonProperty("Response")
    private ResponseData response;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResponseData {

        @JsonProperty("Error")
        private Error error;

        @JsonProperty("TraceId")
        private String traceId;

        @JsonProperty("ResponseStatus")
        private int responseStatus;

        @JsonProperty("Response")
        private BookingResponse response;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Error {
            @JsonProperty("ErrorCode")
            private int errorCode;

            @JsonProperty("ErrorMessage")
            private String errorMessage;
        }

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class BookingResponse {

            @JsonProperty("PNR")
            private String pnr;

            @JsonProperty("BookingId")
            private int bookingId;

            @JsonProperty("SSRDenied")
            private boolean ssrDenied;

            @JsonProperty("SSRMessage")
            private String ssrMessage;

            @JsonProperty("Status")
            private int status;

            @JsonProperty("IsPriceChanged")
            private boolean isPriceChanged;

            @JsonProperty("IsTimeChanged")
            private boolean isTimeChanged;

            @JsonProperty("FlightItinerary")
            private FlightItinerary flightItinerary;

            @Data
            @AllArgsConstructor
            @NoArgsConstructor
            public static class FlightItinerary {

                @JsonProperty("JourneyType")
                private int journeyType;

                @JsonProperty("SearchCombinationType")
                private int searchCombinationType;

                @JsonProperty("TripIndicator")
                private int tripIndicator;

                @JsonProperty("BookingAllowedForRoamer")
                private boolean bookingAllowedForRoamer;

                @JsonProperty("BookingId")
                private int bookingId;

                @JsonProperty("IsCouponAppilcable")
                private boolean isCouponApplicable;

                @JsonProperty("Fare")
                private Fare fare;

                @JsonProperty("Passenger")
                private List<Passenger> passenger;

                @JsonProperty("Segments")
                private List<Segment> segments;

                @JsonProperty("FareRules")
                private List<FareRule> fareRules;

                @Data
                @AllArgsConstructor
                @NoArgsConstructor
                public static class Fare {

                    @JsonProperty("Currency")
                    private String currency;

                    @JsonProperty("BaseFare")
                    private int baseFare;

                    @JsonProperty("Tax")
                    private int tax;

                    @JsonProperty("TaxBreakup")
                    private List<TaxBreakup> taxBreakup;

                    @Data
                    @AllArgsConstructor
                    @NoArgsConstructor
                    public static class TaxBreakup {
                        @JsonProperty("key")
                        private String key;

                        @JsonProperty("value")
                        private int value;
                    }
                }

                @Data
                @AllArgsConstructor
                @NoArgsConstructor
                public static class Passenger {

                    @JsonProperty("PaxId")
                    private int paxId;

                    @JsonProperty("Title")
                    private String title;

                    @JsonProperty("FirstName")
                    private String firstName;

                    @JsonProperty("LastName")
                    private String lastName;

                    @JsonProperty("DateOfBirth")
                    private String dateOfBirth;

                    @JsonProperty("Fare")
                    private Fare fare;

                    @JsonProperty("Baggage")
                    private List<Baggage> baggage;

                    @Data
                    @AllArgsConstructor
                    @NoArgsConstructor
                    public static class Baggage {

                        @JsonProperty("AirlineCode")
                        private String airlineCode;

                        @JsonProperty("FlightNumber")
                        private String flightNumber;

                        @JsonProperty("WayType")
                        private int wayType;

                        @JsonProperty("Code")
                        private String code;

                        @JsonProperty("Description")
                        private String description;
                    }
                }

                @Data
                @AllArgsConstructor
                @NoArgsConstructor
                public static class Segment {

                    @JsonProperty("Baggage")
                    private String baggage;

                    @JsonProperty("CabinClass")
                    private int cabinClass;

                    @JsonProperty("Airline")
                    private Airline airline;

                    @JsonProperty("AirlinePNR")
                    private String airlinePNR;

                    @JsonProperty("Origin")
                    private Location origin;

                    @JsonProperty("Destination")
                    private Location destination;

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
                    }

                    @Data
                    @AllArgsConstructor
                    @NoArgsConstructor
                    public static class Location {
                        @JsonProperty("Airport")
                        private Airport airport;

                        @JsonProperty("DepTime")
                        private String depTime;

                        @JsonProperty("ArrTime")
                        private String arrTime;

                        @Data
                        @AllArgsConstructor
                        @NoArgsConstructor
                        public static class Airport {
                            @JsonProperty("AirportCode")
                            private String airportCode;

                            @JsonProperty("AirportName")
                            private String airportName;

                            @JsonProperty("CityCode")
                            private String cityCode;
                        }
                    }
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
                }
            }
        }
    }
}
