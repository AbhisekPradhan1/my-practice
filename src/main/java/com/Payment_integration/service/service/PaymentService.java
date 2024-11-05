package com.Payment_integration.service.service;
import com.Payment_integration.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PaymentService {
    Payment createPayment(Payment payment) throws Exception;
    Payment getPaymentById(String id);
    List<Payment> getAllPayments();
    Payment updatePayment(String id, Payment payment);
    boolean deletePayment(String id);
}
