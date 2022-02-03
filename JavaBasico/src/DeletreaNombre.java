import java.util.Scanner;

public class DeletreaNombre {
public static void main (String [] args) {
	/*Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.

Ejemplo: "Juan"
"J"
"u"
"a"
"n"
Programa Java que usa charAt

Programa de clase pública {
    public static void main(String[] args) {

	Valor de cadena = "Java" ;
	// Bucle sobre todos los índices en el String.
	for (int i = 0; i < valor.longitud(); i++) {
	    // Obtener char en este índice y mostrarlo. 
	    letra char = valor. charAt (i);
	    System.out.println(letra);
	}
    }
}

Producción

j
a
v
a
*/
	Scanner sc = new Scanner (System.in);
	System.out.println ("Ingresa tu nombre");
	String nombre = sc.nextLine();
	for(int i = 0; i < nombre.length(); i++) {
		System.out.println(nombre.charAt(i));
	}
}
}
