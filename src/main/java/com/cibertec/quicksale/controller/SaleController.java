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

import com.cibertec.quicksale.model.Sale;
import com.cibertec.quicksale.service.ISaleService;

@RestController
@RequestMapping("/sale")
public class SaleController {

	@Autowired
	ISaleService service;
	
	@GetMapping
	public List<Sale> listar() {
		List<Sale> lista = service.listar();
		return lista;
	}
	
	@GetMapping("/{id}")
	public Sale listarPorId(@PathVariable("id") Integer id) {
		Sale s = service.listarPorId(id);
		return s;
	}
	 
	@PostMapping
	public Sale registrar(@RequestBody Sale se) {
		Sale s = service.registrar(se);
		return s;
	}
	
	@PutMapping
	public Sale modificar(@RequestBody Sale se) {
		Sale s = service.modificar(se);
		return s;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		Sale s = service.listarPorId(id);
		if(s != null)
			service.eliminar(id);
	}
}

