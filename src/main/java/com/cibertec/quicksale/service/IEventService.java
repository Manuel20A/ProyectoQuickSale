package com.cibertec.quicksale.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.quicksale.model.Event;

@Service
public interface IEventService {

	Event registrar(Event e);
	Event modificar(Event e);
	List<Event> listar();
	Event listarPorId(Integer id);
	void eliminar(Integer id);
	
}