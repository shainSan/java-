import java.util.Scanner;

public class NumeroMayor {
public static void main (String [] args) {
	System.out.println("Escribe tu primer n�mero");
	Scanner inputOne = new Scanner(System.in);
	int PrimNumero = inputOne.nextInt();
	
	System.out.println("Escribe tu segundo n�mero");
	Scanner inputTwo = new Scanner(System.in);
	int SegNumero = inputTwo.nextInt();
	
	System.out.println("Escribe tu tercer n�mero");
	Scanner inputThree = new Scanner(System.in);
	int ThirNumero = inputThree.nextInt();
	
	if(PrimNumero > SegNumero && PrimNumero > ThirNumero) {
		System.out.println(PrimNumero + "Este es el n�mero mayor");
		} else if(SegNumero > PrimNumero && SegNumero > ThirNumero) {
			System.out.println(SegNumero + "Este es el n�mero mayor");
			} else {
				System.out.println(ThirNumero + "Este es el n�mero mayor");
		}

	}
}