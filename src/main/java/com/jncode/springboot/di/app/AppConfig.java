package com.jncode.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.jncode.springboot.di.app.models.domain.ItemFactura;
import com.jncode.springboot.di.app.models.domain.Producto;
import com.jncode.springboot.di.app.models.service.IServicio;
import com.jncode.springboot.di.app.models.service.MiServicio;
import com.jncode.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicio() {
		
		return new MiServicio();
		
	}
	
	@Bean("miServicioComplejo")
	
	public IServicio registrarMiServicioComplejo() {
		
		return new MiServicioComplejo();
		
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		
		Producto producto1 = new Producto("Pc",1500);
		Producto producto2 = new Producto("Laptop",800);
		Producto producto3 = new Producto("Impresona",100);
		
		ItemFactura l1 = new ItemFactura(producto1, 5);
		ItemFactura l2 = new ItemFactura(producto2, 1);
		ItemFactura l3 = new ItemFactura(producto3, 3);
		
		return Arrays.asList(l1,l2,l3);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		
		Producto producto1 = new Producto("Monitor lg",750);
		Producto producto2 = new Producto("Teclado logitech",80);
		Producto producto3 = new Producto("Mouse gamer",50);
		
		ItemFactura l1 = new ItemFactura(producto1, 1);
		ItemFactura l2 = new ItemFactura(producto2, 3);
		ItemFactura l3 = new ItemFactura(producto3, 2);
		
		return Arrays.asList(l1,l2,l3);
	}
	
}
