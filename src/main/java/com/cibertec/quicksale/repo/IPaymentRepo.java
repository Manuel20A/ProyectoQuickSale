package com.cibertec.quicksale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.quicksale.model.Payment;

public interface IPaymentRepo extends JpaRepository<Payment, Integer> {

}
