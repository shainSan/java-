package operadores;

public class Operadores {
public static void main(String[] args) {
	//Operadores aritmeticos
// +, -, *, %
	int a= 10;
	int b= 20 ;
	double c= 10.5;
	

	int suma = a+ b ;
	System.out.println(suma);
	String str1 = "Este es el resultado de la suma es: ";
	System.out.println(str1 + suma);
	System.out.println("El resultado de la resta: " + (a - b));
	// division
	int division = a / b ;
	System.out.println(division);
	System.out.println( "Este es el resultado de divison:" + division);
     
	//double  division2 = (double)a / b;
	double division2 = c / b;
	//por lo menos uno de los datos debe de ser de tipo double
	//10.0 / 20 = 0.5
	System.out.println( "Este es el resultado de divison:" + division2);
	
	//multiplicacion
	double multiplicacion = c * a;
	System.out.println("El resultado de la division es:" + multiplicacion);
	
	//modulo 
	double modulo= a % b;
	System.out.println("El modulo de la operacion es:" + modulo);
	
	/* Operador de asignacion*/
	int d = 6, e; //inicializar de variables vacias
	e= 6;
	System.out.println(d+ "-" + e);
	
	//Operador de declarion compuesta 
	// +=, -=, *=, /=, &=
	//una operacion simplificada 
	 
	int f = 0, g = 5;
	f += 5;
	//f = f +5
	System.out.println(f);
	//Operadores relacionales 
	/* <, >=, >=
*== igualdad 
*!= diferencia 
*resultado un valor de tipo boolean /boolean (true,false)
*/
	int h = 15, i =25;
	String j="hola";
	System.out.println(h>i); //false
	System.out.println(i != h);
	//System.out.println(h != j);// valores distintos y no se puedes comparar 
	
	//Operador unario 
	/*++, --
	 * preaasignacion ++k se le asigan el valor antes de usarse
	 * posasignacion k++ primero lee el valor despues de la suma 1 
	  */
	int k =0, l=0;
	k++;
	System.out.println(k);
	System.out.println(--l);
	
	//Precedencia de operadores
	
	int operacion = 4 + 5 *6 / 3;//14
	int operacion2 =  (4+5)*6/3;
	// 5 + 6 =30
	//30 /3 =10 
	//4 + 10 = 14 
	System.out.println(operacion);
	System.out.println(operacion2);
	
	int m =0, n =0;
	int operacion3 = ++m + n--;
	System.out.println(operacion3);//1
	
	//operador ternario:
	//es un if.else abreviado 
	//solo nos permite tomar una desicion
	int edad = 19, valor1 =0, valor2 =1;
	int resultado= (edad <= 18)? valor1 :valor2 ;
	System.out.println(resultado);
	
	//operador logico 
	//and -&& 
	//or- || 
	//not !
	
	System.out.println(true && true);//true
	System.out.println(true && false);//false
	System.out.println(true|| false);//true
	System.out.println(true && !false);//true
	
}
}
