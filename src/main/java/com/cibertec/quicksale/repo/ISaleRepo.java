package com.cibertec.quicksale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.quicksale.model.Sale;

public interface ISaleRepo extends JpaRepository<Sale, Integer> {

}
