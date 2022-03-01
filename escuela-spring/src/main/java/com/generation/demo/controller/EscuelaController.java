package com.generation.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.models.SalonModel;
import com.generation.demo.services.SalonServices;

@RestController
public class EscuelaController {
	private final SalonServices salonServices;
	public EscuelaController(@Autowired SalonServices salonServices) {
		this.salonServices = salonServices;
	}
	
	//mostrar datos del salon
	@GetMapping("/salon")
	public ArrayList<SalonModel>obtenerDatos(){
		return salonServices.obtenerDatos();
	}
	
	//guardar datos en la tabla del salon 
	@PostMapping("/salon")
	public SalonModel guardarDatos(@RequestBody SalonModel salonModel) {
		return salonServices.guardarDatos(salonModel);
	}
	//eliminar dato 
	@DeleteMapping(path = "salon/{id}")//localhost:8080/1
	public boolean eliminarDato(@PathVariable("id")Integer id) {
		return salonServices.eliminarDato(id);
	}
}
