package com.Payment_integration.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "payments")

public class Payment {

    @Id
    private String id;
    private String paymentId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private Integer amount;
    private String orderStatus;
    private String razorpayOrderId;
}