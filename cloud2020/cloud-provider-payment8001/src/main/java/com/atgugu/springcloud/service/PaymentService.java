package com.atgugu.springcloud.service;

import com.atgugu.springcloud.entities.Payment;

public interface PaymentService {
        public int create(Payment payment);
        public Payment getPaymentById( Long id);
}
