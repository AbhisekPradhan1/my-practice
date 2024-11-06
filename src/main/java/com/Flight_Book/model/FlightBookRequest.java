package com.Flight_Book.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookRequest {

    @JsonProperty("ResultIndex")
    private String resultIndex;

    @JsonProperty("Passengers")
    private List<Passenger> passengers;

    @JsonProperty("EndUserIp")
    private String endUserIp;

    @JsonProperty("TokenId")
    private String tokenId;

    @JsonProperty("TraceId")
    private String traceId;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Passenger {
        @JsonProperty("Title")
        private String title;

        @JsonProperty("FirstName")
        private String firstName;

        @JsonProperty("LastName")
        private String lastName;

        @JsonProperty("PaxType")
        private int paxType;

        @JsonProperty("DateOfBirth")
        private String dateOfBirth;

        @JsonProperty("Gender")
        private int gender;

        @JsonProperty("PassportNo")
        private String passportNo;

        @JsonProperty("PassportExpiry")
        private String passportExpiry;

        @JsonProperty("AddressLine1")
        private String addressLine1;

        @JsonProperty("AddressLine2")
        private String addressLine2;

        @JsonProperty("Fare")
        private Fare fare;

        @JsonProperty("City")
        private String city;

        @JsonProperty("CountryCode")
        private String countryCode;

        @JsonProperty("CellCountryCode")
        private String cellCountryCode;

        @JsonProperty("ContactNo")
        private String contactNo;

        @JsonProperty("Nationality")
        private String nationality;

        @JsonProperty("Email")
        private String email;

        @JsonProperty("IsLeadPax")
        private boolean isLeadPax;

        @JsonProperty("FFAirlineCode")
        private String ffAirlineCode;

        @JsonProperty("FFNumber")
        private String ffNumber;

        @JsonProperty("GSTCompanyAddress")
        private String gstCompanyAddress;

        @JsonProperty("GSTCompanyContactNumber")
        private String gstCompanyContactNumber;

        @JsonProperty("GSTCompanyName")
        private String gstCompanyName;

        @JsonProperty("GSTNumber")
        private String gstNumber;

        @JsonProperty("GSTCompanyEmail")
        private String gstCompanyEmail;
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

        @JsonProperty("AdditionalTxnFeePub")
        private double additionalTxnFeePub;

        @JsonProperty("AdditionalTxnFeeOfrd")
        private double additionalTxnFeeOfrd;

        @JsonProperty("OtherCharges")
        private double otherCharges;

        @JsonProperty("Discount")
        private double discount;

        @JsonProperty("PublishedFare")
        private double publishedFare;

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
}
