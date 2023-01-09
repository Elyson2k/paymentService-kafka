package com.apachekafka.projeto.controller.impl;

import com.apachekafka.projeto.controller.PaymentResource;
import com.apachekafka.projeto.model.Payment;
import com.apachekafka.projeto.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentResourceImpl implements PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
