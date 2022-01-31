import java.util.Scanner;

public class NumeroMayor {
public static void main (String [] args) {
	System.out.println("Escribe tu primer número");
	Scanner inputOne = new Scanner(System.in);
	int PrimNumero = inputOne.nextInt();
	
	System.out.println("Escribe tu segundo número");
	Scanner inputTwo = new Scanner(System.in);
	int SegNumero = inputTwo.nextInt();
	
	System.out.println("Escribe tu tercer número");
	Scanner inputThree = new Scanner(System.in);
	int ThirNumero = inputThree.nextInt();
	
	if(PrimNumero > SegNumero && PrimNumero > ThirNumero) {
		System.out.println(PrimNumero + "Este es el número mayor");
		} else if(SegNumero > PrimNumero && SegNumero > ThirNumero) {
			System.out.println(SegNumero + "Este es el número mayor");
			} else {
				System.out.println(ThirNumero + "Este es el número mayor");
		}

	}
}