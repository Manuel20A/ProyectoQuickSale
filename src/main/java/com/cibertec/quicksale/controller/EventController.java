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

import com.cibertec.quicksale.model.Event;
import com.cibertec.quicksale.service.IEventService;

@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	IEventService service;
	
	@GetMapping
	public List<Event> listar() {
		List<Event> lista = service.listar();
		return lista;
	}
	
	@GetMapping("/{id}")
	public Event listarPorId(@PathVariable("id") Integer id) {
		Event e = service.listarPorId(id);
		return e;
	}
	 
	@PostMapping
	public Event registrar(@RequestBody Event ev) {
		Event e = service.registrar(ev);
		return e;
	}
	
	@PutMapping
	public Event modificar(@RequestBody Event ev) {
		Event e = service.modificar(ev);
		return e;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")Integer id) {
		Event e = service.listarPorId(id);
		if(e != null)
			service.eliminar(id);
	}
}

