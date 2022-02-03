package Ciclos;

public class Ciclos {
 public static void main (String[] args) {
	 //while 
	 /*int control = 0;
	  
	 while(control < 10) {
		 System.out.println("Control =" + control);
		 control++;
	 }*/
	 // do while 
	/* int control = 3;
	 do {
		 // codigo a ejecutar
		 System.out.println("Control =:" + control);
		 // modificador de la variable de control
		 control++;
	 } while(control < 3);
	 */
// for 
/*	 for(int i=0;i < 10;i++) {
		 if(i % 2 == 0) {
		 System.out.println("Control =" + i);
		 break;// termina el ciclo 
		 // solo deja que se ejecute una vez lo que esta antes
		 }
		 System.out.println("Control =" + i);
		 }*/
	// for 
	 	 for(int i=0;i < 10; i++) {
	 		 if(i % 2 == 0) {// solo se ejecuta cuando el valor de i es par
	 		
	 		 continue;// permite saltarnos una ejecucuin del ciclo 
	 		 // deja que continue el ciclo 
	 		 }
	 		 System.out.println("Control =" + i);
	 		 }
	 for(int i=0;i < 3; i++) {
		 System.out.println("Control 2 =" + i);
		 }
}
}
