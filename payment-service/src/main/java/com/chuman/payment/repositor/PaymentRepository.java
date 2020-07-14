package com.chuman.payment.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chuman.payment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
 Payment findByOrderId(int orderId);
}
