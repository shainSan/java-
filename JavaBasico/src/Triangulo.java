import java.util.Scanner;

public class Triangulo {
public static void main (String [] arg) {
	System.out.println("Ingresa los �ngulos para saber si se forma un tri�ngulo");
	Scanner angulo = new Scanner(System.in);
	int angulo1, angulo2, angulo3;
	
	System.out.println("Escribe tu primer �ngulo");
	angulo1 = angulo.nextInt();
	System.out.println("Escribe tu segundo �ngulo");
	angulo2 = angulo.nextInt();
	System.out.println("Escribe tu tercer �ngulo");
	angulo3 = angulo.nextInt();
	
	int trianguloResultado = angulo1 + angulo2 + angulo3;
	System.out.println(trianguloResultado == 180 
		? "Tus �ngulos forman un tri�ngulo"
		: "Tus �ngulos no forman un tri�ngulo");	
}
}

