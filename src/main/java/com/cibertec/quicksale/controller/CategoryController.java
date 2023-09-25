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

import com.cibertec.quicksale.model.Category;
import com.cibertec.quicksale.service.ICategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	ICategoryService service;
	
	@GetMapping
	public List<Category> listar() {
		List<Category> lista = service.listar();
		return lista;
	}
	
	@GetMapping("/{id}")
	public Category listarPorId(@PathVariable("id") Integer id) {
		Category c = service.listarPorId(id);
		return c;
	}
	 
	@PostMapping
	public Category registrar(@RequestBody Category c) {
		Category ca = service.registrar(c);
		return ca;
	}
	
	@PutMapping
	public Category modificar(@RequestBody Category c) {
		Category ca = service.modificar(c);
		return ca;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		Category c = service.listarPorId(id);
		if(c != null)
			service.eliminar(id);
	}
}

