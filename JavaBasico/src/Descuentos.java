import java.util.Scanner;

public class Descuentos {
	public static void main (String[] args) {
		System.out.println("Ingrese total de su cuenta.");
	 Scanner sc = new Scanner(System.in);
	
	float numero = sc.nextFloat();
	 if(numero<=1000){
	System.out.println("El descuento no es válido.");
	}
	else if(numero<= 1001 && numero>= 4999){
	System.out.println( "Tu total con descuento del 10% es:" + (numero * 0.9));
	} else if(numero<=5000 && numero>=9999){
	System.out.println( "Tu total con descuento del 20% es:" + (numero * 0.8 ));
	} else if(numero>10000){
	System.out.println( "Tu total con descuento del 30% es:" + (numero * 0.7));}
	
	else {System.out.println("Ha ocurrido un error." );
	} }
}