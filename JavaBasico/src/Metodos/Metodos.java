package Metodos;
//Hay una solo paquete que esta especialiazdo para el metodo main
public class Metodos {
// Metodo es una funcion 
	//Atributos de la clase
	int a, b;
	
	
	
	//Metodo void (Vacio)
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar: " +a+" más " +b+" es " +resultado);
		
	}
	//Metodo con retorno de valores 
	public int sumaConRetorno() {
		//int resultado = a + b;
		//return resultado;
		return a + b;
		
	}
	// Argumentos
	//suma (argumentos)
	/*public int multiplicarConAgumentos(int arg1, int arg2) {
		int c = arg1;
		int d = arg2;
		return c*d;*/
		public double multiplicacionconArgumentos(double arg1,double arg2) {
			double c = arg1;
			double d =arg2;
			return c*d;
	}
		//Metodo estatico
		// es estatito void(no regresa datos), usa argumentos 
		public static void imprimirNombre(String nombre) {
			System.out.println("Mi nombre es:" + nombre);
			
		}
}
