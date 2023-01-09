package com.apachekafka.projeto.service;

import com.apachekafka.projeto.model.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentService {

    public void sendPayment(Payment payment){
        log.info("PAYMENT_SERVICE ::: Recebi o pagamento {}", payment);
    }
}
