import java.util.Scanner;

public class Calcuradora {
public static void main (String[] args) {
	/*
	   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
	   * 1) Suma
	   * 2) Resta
	   * 3) División
	   * 4) Multiplicación
	   * 
	   * y despues imprimir el resultado
	   */
	float numero1 =0f, numero2=0f;
System.out.println("Escribe tu numero 1");
Scanner sc = new Scanner(System.in);
float num1 = sc.nextFloat();

System.out.println("Escribe tu numero 2");
Scanner sc2 = new Scanner(System.in);
float num2 = sc.nextFloat();
sc.nextLine();

System.out.println("Introduce la operaion a realizar");
String operacion = sc.nextLine();
//String operacion ="suma";
//sc.nextLine();
 System.out.println(operacion);
 
switch(operacion.trim()) {
case "suma":
System.out.println("El resultado de la suma es :" + (num1 + num2));
break;
case "resta":
System.out.println("El resultado de la resta es:" + (num1 -num2));
break;
case "multiplicacion":
System.out.println("El resultado de la multiplicacion es:" + (num1 * num2));
break;
case "divison":
	System.out.println("La division de tus numeros es:"+ (num1 / num2 ));
	break;
}

}
}
