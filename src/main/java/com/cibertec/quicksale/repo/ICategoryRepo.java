package com.cibertec.quicksale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.quicksale.model.Category;

public interface ICategoryRepo extends JpaRepository<Category,Integer>{
	
}
