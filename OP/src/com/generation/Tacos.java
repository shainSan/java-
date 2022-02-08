package com.generation;

public class Tacos {
	
  String tipoDeTortilla;
	String  tipoDeGuisado;
	int	 numeroDeTortilla;
		String 	 tamanioDeTortilla;
      float precio = 0.0f;
       
      //El constructor nos ayuda a analizar objetos para la iniilaizacion de valores 
      public Tacos () {
    	  
      }
      public Tacos(String tipoDeTortilla) {
    	  this.tipoDeTortilla = tipoDeTortilla;
    	  
      }
      
      
      public Tacos(String tipoDeTortilla, String tipoDeGuisado,
    		  int numeroDeTortilla, String tamanioDeTortilla,
    		  float precio ) {
    	  //this marca el string en azul y el cafe marca de dentro de el parentesis 
    	this.tipoDeTortilla = tipoDeTortilla;
    	this.tipoDeGuisado = tipoDeGuisado;
    	this.tamanioDeTortilla = tamanioDeTortilla;
    	this.numeroDeTortilla = numeroDeTortilla;
    	this.precio = precio;
    	
      }
      
      public int getNumeroDeTortillas() {
    	  return this.numeroDeTortilla;
      }
      
      
      public void setNumeroTortilla(int numeroDeTortilla) {
  		if (numeroDeTortilla <= 0 &&  numeroDeTortilla <2){// 0 - 5
  			this.numeroDeTortilla = numeroDeTortilla;
  		}else {
  			throw new IllegalArgumentException("El numero de tortillas no es valido");
  			
  		}
  	
  		
  	}
 
      void  preparar() {
    	  System.out.println("Prepara tu rico taco");
      }
      
      void vender () {
    	  System.out.println("Taco vendido");
      }

 void ponerSalsa () {
	 System.out.println("Agregando salsa de la que no pica");
 }
  void subirPrecio(float aumento) {
	  precio = precio + aumento;
	  
  }

@Override
public String toString() {
	return "Tacos [TipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
			+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
}
 
}

