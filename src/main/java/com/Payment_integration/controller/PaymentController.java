package com.Payment_integration.controller;
import com.Payment_integration.model.Payment;
import com.Payment_integration.service.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // POST method to create a new payment
    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) throws Exception {
        Payment Payment = paymentService.createPayment(payment);
        return new ResponseEntity<>(Payment, HttpStatus.CREATED);
    }

    // GET method to retrieve a payment by ID
    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable String id) {
        Payment payment = paymentService.getPaymentById(id);
        return payment != null
                ? ResponseEntity.ok(payment)
                : ResponseEntity.notFound().build();
    }

    // PUT method to update an existing payment
    @PutMapping("/{id}")
    public ResponseEntity<Payment> updatePayment(@PathVariable String id, @RequestBody Payment payment) {
        Payment updatedPayment = paymentService.updatePayment(id, payment);
        return updatedPayment != null
                ? ResponseEntity.ok(updatedPayment)
                : ResponseEntity.notFound().build();
    }
 @GetMapping
    public ResponseEntity<List<Payment>> getAllPayments() {
        List<Payment> payments = paymentService.getAllPayments();
        return ResponseEntity.ok(payments);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable String id) {
        boolean isDeleted = paymentService.deletePayment(id);
        return isDeleted
                ? ResponseEntity.noContent().build() // 204 No Content
                : ResponseEntity.notFound().build(); // 404 Not Found
    }

}
