package com.cibertec.quicksale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.quicksale.model.Payment;
import com.cibertec.quicksale.service.IPaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	IPaymentService service;
	
	@GetMapping
	public List<Payment> listar() {
		List<Payment> lista = service.listar();
		return lista;
	}
	
	@GetMapping("/{id}")
	public Payment listarPorId(@PathVariable("id") Integer id) {
		Payment p = service.listarPorId(id);
		return p;
	}
	 
	@PostMapping
	public Payment registrar(@RequestBody Payment pa) {
		Payment p = service.registrar(pa);
		return p;
	}
	
	@PutMapping
	public Payment modificar(@RequestBody Payment pa) {
		Payment p = service.modificar(pa);
		return p;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		Payment p = service.listarPorId(id);
		if(p != null)
			service.eliminar(id);
	}
}

