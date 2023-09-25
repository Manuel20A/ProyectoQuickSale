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

import com.cibertec.quicksale.model.DetailsEvents;
import com.cibertec.quicksale.service.IDetailsEventsService;

@RestController
@RequestMapping("/detailsevents")
public class DetailsEventsController {

	@Autowired
	IDetailsEventsService service;
	
	@GetMapping
	public List<DetailsEvents> listar() {
		List<DetailsEvents> lista = service.listar();
		return lista;
	}
	
	@GetMapping("/{id}")
	public DetailsEvents listarPorId(@PathVariable("id") Integer id) {
		DetailsEvents c = service.listarPorId(id);
		return c;
	}
	 
	@PostMapping
	public DetailsEvents registrar(@RequestBody DetailsEvents de) {
		DetailsEvents d = service.registrar(de);
		return d;
	}
	
	@PutMapping
	public DetailsEvents modificar(@RequestBody DetailsEvents de) {
		DetailsEvents d = service.modificar(de);
		return d;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		DetailsEvents d = service.listarPorId(id);
		if(d != null)
			service.eliminar(id);
	}
}
