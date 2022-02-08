package com.generation;

public class Main {
public static void main (String[] args) {
 Tacos taco1 = new Tacos ("Tortilla de harina", "Pork belly", 3, "Tortilla taquera" , 250);	
 
/* taco1.tipoDeTortilla = "Tortilla de harina";
 taco1.tipoDeGuisado = "Pork belly";
 taco1.numeroDeTortilla = 3;
 taco1.tamanioDeTortilla = "Torilla taquera";
 taco1.precio = 250; 
 taco1.subirPrecio(5.5f); */
 
 System.out.println(taco1.toString());
 
 Tacos taco2 = new Tacos ();
 taco2.tipoDeTortilla = "Tortilla hecha a mano";
 taco2.tipoDeGuisado = "Pulpo en adobo";
 taco2.numeroDeTortilla = 3;
 taco2.tamanioDeTortilla = "Tortilla taquera";
 taco2.precio = 150;

 System.out.println(taco2.toString());

 
 Tacos taco3 = new 	Tacos("Maiz");
 System.out.println(taco1);
 System.out.println(taco2);
 System.out.println(taco3);
 
}
}
