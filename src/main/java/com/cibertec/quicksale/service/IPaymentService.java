package com.cibertec.quicksale.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.quicksale.model.Payment;

@Service
public interface IPaymentService {

	Payment registrar(Payment p);
	Payment modificar(Payment p);
	List<Payment> listar();
	Payment listarPorId(Integer id);
	void eliminar(Integer id);
	
}