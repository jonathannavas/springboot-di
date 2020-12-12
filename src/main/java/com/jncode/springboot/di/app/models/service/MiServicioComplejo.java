package com.jncode.springboot.di.app.models.service;

//@Service("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "Se esta ejecutando algun proceso importante complicado";
	}
		
}
