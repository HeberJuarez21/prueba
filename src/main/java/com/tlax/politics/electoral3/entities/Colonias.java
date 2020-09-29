package com.tlax.politics.electoral3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colonias")
public class Colonias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "colonia_id")
	private Long colonia_id;
	
	@Column(name = "colonia_nombre")
	private String colonia_nombre;
	
	@Column(name = "colonia_responsable")
	private String colonia_responsable;
	
	@Column(name = "colonia_number")
	private Long colonia_number;
	
	@Column(name = "municipio_id")
	private Long municipio_id;
	
	@Column(name = "isactive")
	private Boolean isactive;

	public Long getColonia_id() {
		return colonia_id;
	}

	public void setColonia_id(Long colonia_id) {
		this.colonia_id = colonia_id;
	}

	public String getColonia_nombre() {
		return colonia_nombre;
	}

	public void setColonia_nombre(String colonia_nombre) {
		this.colonia_nombre = colonia_nombre;
	}

	public String getColonia_responsable() {
		return colonia_responsable;
	}

	public void setColonia_responsable(String colonia_responsable) {
		this.colonia_responsable = colonia_responsable;
	}

	public Long getColonia_number() {
		return colonia_number;
	}

	public void setColonia_number(Long colonia_number) {
		this.colonia_number = colonia_number;
	}

	public Long getMunicipio_id() {
		return municipio_id;
	}

	public void setMunicipio_id(Long municipio_id) {
		this.municipio_id = municipio_id;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
}
