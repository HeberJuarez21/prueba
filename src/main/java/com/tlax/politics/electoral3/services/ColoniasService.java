package com.tlax.politics.electoral3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlax.politics.electoral3.entities.Colonias;
import com.tlax.politics.electoral3.repositories.ColoniasRepository;

@Service
public class ColoniasService {
	
	@Autowired
	ColoniasRepository ColoniasRep;
	
	public Colonias saveColonias(String colonia_nombre, String colonia_responsable,
			Long colonia_number, Long municipio_id, Boolean isactive) {
		Colonias cl = new Colonias();
		cl.setColonia_nombre(colonia_nombre);
		cl.setColonia_responsable(colonia_responsable);
		cl.setColonia_number(colonia_number);
		cl.setMunicipio_id(municipio_id);
		cl.setIsactive(isactive);
		
		Colonias newColonias = ColoniasRep.save(cl);
		return newColonias;
	}
}
