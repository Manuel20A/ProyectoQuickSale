package com.cibertec.quicksale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.quicksale.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer>{

}