package com.cibertec.quicksale.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.quicksale.model.Sale;

@Service
public interface ISaleService {

	Sale registrar(Sale s);
	Sale modificar(Sale s);
	List<Sale> listar();
	Sale listarPorId(Integer id);
	void eliminar(Integer id);
	
}
