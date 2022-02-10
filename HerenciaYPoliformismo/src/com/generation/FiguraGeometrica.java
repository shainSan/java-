package com.generation;

public abstract class FiguraGeometrica {
	// Clases abstractas 
	//Clases que pueden o no contener metodos abstractos
	//	No se pueden crear obejos de una clase abstracta,no se pueden heredar	
	//obliga a utilizar un polimorfismo en clases hijas 
	
	
	
	// Si son private solo se puede acceder desde la misma clase 
	private String nombre;
	protected float alto;
	protected float largo;
	
	//public FigurasGeometricas() {
		
	//}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public FiguraGeometrica() {
		super();
	}

	public FiguraGeometrica(String nombre, float alto, float largo) {
		super();
		this.nombre = nombre;
		this.alto = alto;
		this.largo = largo;
	}

	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
		
	}
	public String getNombre() {
		return nombre;
	}

	

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	/*public float calcularArea() {
		return alto * largo;
	}*/
	public  abstract float calcularArea();
	
	public abstract float perimetro ();
	
	}
