import java.util.Scanner;

public class ScannerYBufer {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce un numero");
	int numero1 = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Introduce nombre");
	String nombre = sc.next();
	// cerrar el scannr para evitar problemas 
	sc.close();
	//System.out.println("Introduce otro numero");
	//int numero2 = sc.nextInt();
	
	System.out.println("Tu nombre es:" + nombre + ".Tu numero es:" + numero1);
	
//	System.out.println("Número 1:" + numero1 + "Número2:" + numero2);
}
}
