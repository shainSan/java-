import java.util.Scanner;

public class EstructuraDeControlSwich {

	// Estructuras de control  para cntrolar el flujo de algun programa 
	// la toma de desiciones 
	/*
	 * Swich(condicion a evaluar){
	 * case"valor":
	 // condicion a ajecutar 
	  //break 
	  case "n"
	  //codigo a ejecutar 
	   //break
	    * default:
	    // codigo a ejecutar 
	   */
	// Solicitar al usuario 
	public static void main (String[] args) {
		System.out.println("Introduce el dia y recibe tu mensaje <3 ");
	Scanner sc = new Scanner(System.in);
	String dia = sc.nextLine();
	//String dia ="sabado";
	//System.out.println(dia);
	switch(dia.toLowerCase().trim()){
		case "lunes":
			System.out.println("Ya mero es viernes toma un café");
			break;
		case "martes":
			System.out.println("Vas avanzando poco a poco");
			break;
		case "miercoles":
		System.out.println("Ombligo de semana");
		break;
		case "jueves":
			System.out.println("Ya es juebebes");
			break;
		case "viernes":
			System.out.println("Ya es viernes y el cuerpo lo sabe");
			break;
		case"sabado":
		case"domingo":
			System.out.println("Basta de trabajacion");
			break;
			default:
				System.out.println("dia desconocido");
		
	}
	}
}

