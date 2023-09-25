package com.cibertec.quicksale.model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sale")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSale;
	
	private Date saleDate;
	private String operationNumber;
	private double total;
	private int Quantity;
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_event", referencedColumnName = "idEvent")
	private Event event;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_customer", referencedColumnName = "idCustomer")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_payment", referencedColumnName = "idPayment")
	private Payment payment;
	
	public int getIdSale() {
		return idSale;
	}

	public void setIdSale(int idSale) {
		this.idSale = idSale;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public String getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
