package com.generation;

public  class Triangulo extends FiguraGeometrica {

	 public Triangulo() {
		 super ("Triangulo");
	 }
	 @Override //metodo que se le aplica polimorfismo 
	 public float calcularArea() {
			//return (alto * largo) /2;
		 return (getAlto() * getLargo()) /2 ;// cuando se tienen desde otra clase
		}
	@Override
	public  float perimetro() {
return 0;		
	}
}