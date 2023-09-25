package com.cibertec.quicksale.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.quicksale.model.DetailsEvents;

@Service
public interface IDetailsEventsService {

	DetailsEvents registrar(DetailsEvents de);
	DetailsEvents modificar(DetailsEvents de);
	List<DetailsEvents> listar();
	DetailsEvents listarPorId(Integer id);
	void eliminar(Integer id);
	
}