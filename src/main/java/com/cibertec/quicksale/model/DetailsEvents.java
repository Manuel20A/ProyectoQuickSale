package com.cibertec.quicksale.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detailsevents")
public class DetailsEvents {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDetailsEvents;
	
	private String description;
	private String title;
	private String importante;
	private String link;
	private String comentarios;
	private String urlImageRef;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Event", referencedColumnName = "idEvent")
	private Event event;

	public int getIdDetailsEvents() {
		return idDetailsEvents;
	}

	public void setIdDetailsEvents(int idDetailsEvents) {
		this.idDetailsEvents = idDetailsEvents;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImportante() {
		return importante;
	}

	public void setImportante(String importante) {
		this.importante = importante;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getUrlImageRef() {
		return urlImageRef;
	}

	public void setUrlImageRef(String urlImageRef) {
		this.urlImageRef = urlImageRef;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
