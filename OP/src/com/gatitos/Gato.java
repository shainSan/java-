package com.gatitos;

public class Gato {
// stributos 
	private String nombre;
	private int patas;
	private boolean adoptado;
 
	// getters y setters 
	// deben de ser publico 
	public  String getNombre() {
		return this.nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int Patas) {
		if (patas <= 0 &&  patas <5){// 0 - 5
			this.patas = Patas;
		}else {
			throw new IllegalArgumentException("El numero de patas no es valido");
			
		}
		//this.patas = patas;
		
	}
	public boolean  isAdoptado() {
		return this.adoptado;
		
	}
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
		
	}
	//metodo toString
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
	
	
	}
	
	

