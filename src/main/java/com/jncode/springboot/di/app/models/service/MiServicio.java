package com.jncode.springboot.di.app.models.service;

//@Primary
//@Service("miServicioSimple")
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "Se esta ejecutando algun proceso importante simple";
	}
		
}
