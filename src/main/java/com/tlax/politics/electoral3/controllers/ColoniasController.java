package com.tlax.politics.electoral3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tlax.politics.electoral3.entities.Colonias;
import com.tlax.politics.electoral3.services.ColoniasService;

@RestController
public class ColoniasController {
	
	@Autowired
	ColoniasService serv;
	
	@GetMapping(value = "Colonias/save", produces =  MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Colonias save(
			@RequestParam(name = "colonia_nombre") String colonia_nombre,
			@RequestParam(name = "colonia_responsable") String colonia_responsable,
			@RequestParam(name = "colonia_number") Long colonia_number,
			@RequestParam(name = "municipio_id") Long municipio_id,
			@RequestParam(name = "isactive") Boolean isactive
			) {
		return serv.saveColonias(colonia_nombre, colonia_responsable, colonia_number, municipio_id, isactive);
	}
	
	//hola como estas
}
