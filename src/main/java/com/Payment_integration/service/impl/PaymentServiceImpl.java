package com.Payment_integration.service.impl;
import com.Payment_integration.model.Payment;
import com.Payment_integration.repository.PaymentRepository;
import com.Payment_integration.service.service.PaymentService;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.razorpay.Order;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;
    private RazorpayClient razorpayClient;
    @Value("${razorpay.api.key}")
    private String razorpayKey;
    @Value("${razorpay.api.secret}")
    private String razorpaySecret;public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }


    private void initRazorpayClient() throws RazorpayException {
        if (razorpayClient == null) {
            razorpayClient = new RazorpayClient(razorpayKey, razorpaySecret);
        }
    }

    public Payment createPayment(Payment payment) throws Exception {
        initRazorpayClient();

        try {
            JSONObject orderReq = new JSONObject();
            orderReq.put("amount", payment.getAmount() * 100);
            orderReq.put("currency", "INR");
            orderReq.put("receipt", payment.getCustomerEmail());

            Order razorpayOrder = razorpayClient.orders.create(orderReq);


            payment.setRazorpayOrderId(razorpayOrder.get("id"));
            payment.setOrderStatus(razorpayOrder.get("status"));
            Payment savedPayment = paymentRepository.save(payment);

             // logger.info("Payment record saved: {}", savedPayment);
            return savedPayment;
        } catch (RazorpayException e) {
            // logger.error("Error creating Razorpay order: {}", e.getMessage());
            throw new Exception("Unable to create payment order. Please try again later.");
        }
    }

    @Override
    public Payment getPaymentById(String id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment updatePayment(String id, Payment payment) {
        if (!paymentRepository.existsById(id)) {
            return null;
        }
        payment.setId(id);
        return paymentRepository.save(payment);
    }

    @Override
    public boolean deletePayment(String id) {
        if (!paymentRepository.existsById(id)) {
            return false;
        }
        paymentRepository.deleteById(id);
        return true;
    }
}
