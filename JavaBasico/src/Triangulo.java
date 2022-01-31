import java.util.Scanner;

public class Triangulo {
public static void main (String [] arg) {
	System.out.println("Ingresa los ángulos para saber si se forma un triángulo");
	Scanner angulo = new Scanner(System.in);
	int angulo1, angulo2, angulo3;
	
	System.out.println("Escribe tu primer ángulo");
	angulo1 = angulo.nextInt();
	System.out.println("Escribe tu segundo ángulo");
	angulo2 = angulo.nextInt();
	System.out.println("Escribe tu tercer ángulo");
	angulo3 = angulo.nextInt();
	
	int trianguloResultado = angulo1 + angulo2 + angulo3;
	System.out.println(trianguloResultado == 180 
		? "Tus ángulos forman un triángulo"
		: "Tus ángulos no forman un triángulo");	
}
}

