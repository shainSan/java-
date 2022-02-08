package paquete2;

import paquete1.ClaseDefaul;
import paquete1.ClaseProtected;

public class Main extends paquete1.ClaseProtected {
public static void main  (String [] args) {
	 
	ClaseDefaul prueba = new  ClaseDefaul();

	//prueba.mostrar();
	
	ClasePrivada privada = new ClasePrivada();
	
 //	privada.edad = 30;
	//privada.nombre = "Juan";
	privada.setSaludar("Juan");

	System.out.println(privada.getSaludar());
	//System.out.println(privada.nombre);
	
	//Objeto de la clase protected
	ClaseProtected protegido = new ClaseProtected();
 protegido.setEdad(18);	
System.out.println(protegido.getEdad());
}
}
