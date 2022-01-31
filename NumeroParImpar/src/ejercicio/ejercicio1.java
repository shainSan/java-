package ejercicio;
import java.util.Scanner;
public class ejercicio1 {
		static Scanner entrada = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			int numero;
			
			System.out.println("Ingresar un numero: ");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0)
				
			System.out.println("Par");
			else
				System.out.println("Impar");
			
		}

	}