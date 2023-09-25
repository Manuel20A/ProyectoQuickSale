package com.cibertec.quicksale.service;

import java.util.List;

import com.cibertec.quicksale.model.Customer;

public interface ICustomerService {

	Customer registrar(Customer cu);
	Customer modificar(Customer cu);
	List<Customer> listar();
	Customer listarPorId(Integer id);
	void eliminar(Integer id);
	
}
