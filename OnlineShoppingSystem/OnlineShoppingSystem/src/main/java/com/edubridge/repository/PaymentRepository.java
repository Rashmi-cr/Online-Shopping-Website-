package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment , Integer> {

}
