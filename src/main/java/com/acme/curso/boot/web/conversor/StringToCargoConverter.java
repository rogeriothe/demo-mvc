package com.acme.curso.boot.web.conversor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acme.curso.boot.domain.Cargo;
import com.acme.curso.boot.services.CargoService;

@Component
public class StringToCargoConverter implements Converter<String, Cargo> {

	@Autowired
	private CargoService service;
	
	@Override
	public Cargo convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		
		Long id = Long.valueOf(text);
		
		return service.buscarPorId(id);				
		
		
	}

}
