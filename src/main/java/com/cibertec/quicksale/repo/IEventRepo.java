package com.cibertec.quicksale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.quicksale.model.Event;

public interface IEventRepo extends JpaRepository<Event, Integer>{

}
