import java.util.Scanner;

public class EstructuraDeControlf {
	public static void main (String[] args) {
// Estructuras de control de flujo 
	// Nos sirve para la toma de desiciones 
	//nos sriven para cambiar el flujo de nuestro programa evaluando una condicion 
	//A partir de la evaluacion se realiza una accion u otra 
		
		/*if (condicion ){
		codigo }
		else {
			codigo
		}*/
		
		//Muestra el mensaje por consola
		System.out.println("Introduce tu edad");
		//Pide la informacion del usuario 
		Scanner sc = new Scanner(System.in);
		//Recuperacion de un dato y unirlo a una variable 
		int edad = sc.nextInt();
		if(edad >=18) {
		System.out.println("Eres mayor de edad");	
		}else {
		System.out.println("Eres menor de edad");
		}
		}
	}

