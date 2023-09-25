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

import com.cibertec.quicksale.model.Customer;
import com.cibertec.quicksale.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	ICustomerService service;
	
	@GetMapping
	public List<Customer> listar() {
		List<Customer> lista = service.listar();
		return lista;
	}
	
	@GetMapping("/{id}")
	public Customer listarPorId(@PathVariable("id") Integer id) {
		Customer c = service.listarPorId(id);
		return c;
	}
	 
	@PostMapping
	public Customer registrar(@RequestBody Customer cu) {
		Customer c = service.registrar(cu);
		return c;
	}
	
	@PutMapping
	public Customer modificar(@RequestBody Customer cu) {
		Customer c = service.modificar(cu);
		return c;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		Customer c = service.listarPorId(id);
		if(c != null)
			service.eliminar(id);
	}
}

