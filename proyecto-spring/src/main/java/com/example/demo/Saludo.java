package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // hace peticiones http
public class Saludo {

	@GetMapping("/")
	public String saludo() {
		return "Shain";
	}
	@GetMapping("/saludo")// se agrega a la pagina al final 
	public String saludar(@RequestParam(value = "nombre",
		defaultValue = "Java") String nombre, @RequestParam(value = "apellidos") String apellidos) {
		return "Hola " + nombre + " " + apellidos;
	}
	@PostMapping("/login")
	public String login(@RequestParam(value= "correo")String correo,
			@RequestParam(value = "password")String password) {
		return correo + " - " + password;
	}
	
	}
