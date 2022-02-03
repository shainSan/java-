package Ciclos;

import java.util.Scanner;

public class Tabla {
	public static void main(String[] args) {
	/*Utilizando un bucle while
1.- Crea una nueva clase llamada Tabla
2.- Copia el siguiente codigo y verifica que funcione */
	 
	        Scanner console = new Scanner(System.in);
	        int num;
	        System.out.println("Ingresa el numero positivo");
	        num = console.nextInt();
	        System.out.println("Tabla de multiplicar de" + num);
	         
	        //Implementa un bucle while que imprima el resultado
	        System.out.println("-----");
	        for(int i =1; i <= 20; i ++) {
	        	System.out.println("x" + num + "="+ (i*num));
	        }
	        System.out.println("");
	}
}
