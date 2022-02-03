package Arreglos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
public static void main (String [] args) {
			//Las colecciones nos sirven para alamcenar un conjunto 
			//de objetos
			//La diferencia de las colecciones y objetos
			// es  que las colecciones son dinamicas, pueden cambiar
			//el numero de objetos agregados
			//set  tiene 3 implicaciones
			//no puede contener elementos repetidos

			//HashSet
			//los elementos no mantienen un orden
			//Es la implementacion mas rapida
			//
			/*Set<String> frutas = new HashSet<String>();
			frutas.add("Mango");
			frutas.add("Granada");
			frutas.add("Piña");
			frutas.add("Sandia");
			frutas.add("Uva");
			frutas.add("mamey");
			frutas.add("Platano");
			frutas.add("Fresa");
			*/
			//foreach, puede recorrer una coleccion y en cada
			//recorrdio recupera el valor y lo podemnos almacenar
			//en una variable
			//Sintaxis
			//for(tipoDeDatoElemento variable :elementoARecorrer
			/*for(String fruta:frutas) {
				System.out.println(fruta);
			//colecciones dinamicas
			//arreglo no	
			}
			*/
			
			//TreeSet
			//esta implementacion ordena los elementos
			//de sus valors
			//es la implementacion mas lenta
			
			
			/*Set<String> frutas = new TreeSet<String>();
			frutas.add("mango");
			frutas.add("granada");
			frutas.add("piña");
			frutas.add("sandia");
			frutas.add("uva");
			frutas.add("Mamey");
			frutas.add("platano");
			frutas.add("fresa");
			
			for(String fruta:frutas) {
				System.out.println(fruta);
				
			} */
				
			//LinkedHashSet
	// ordena los elementos en orden de insersión 
	// es mas costoso que hashset
		/*	Set<String> frutas = new LinkedHashSet<String>();
			frutas.add("mango");
			frutas.add("granada");
			frutas.add("piña");
			frutas.add("sandia");
			frutas.add("uva");
			frutas.add("Mamey");
			frutas.add("platano");
			frutas.add("fresa");
			
			for(String fruta:frutas) {
				System.out.println(fruta);
				
			}*/
	
	//List simplemente enlazada
// se permiten los elemtos duplicados 
	// acceder a los elementos especificos 
	//buscar elementos
	//ArrayList
	List<String> pokemones = new ArrayList<String>();
	pokemones.add("chicorita");
	pokemones.add("Eeve");
	pokemones.add("patamon");
	pokemones.add("dragonite");
	pokemones.add("charizard");
	pokemones.add("gengar");
	pokemones.add("flygon");
	pokemones.add("flygon");
	//agregar pokemon , el elemento no se remplza solo se desplaza
	/*
	 por lo tanto no borra el elemento
	 */
	//pokemones.add(2,"pikachu");
	
	//buscar el pokemon y devuelve la poscicion
	//si hay dos elementos con el mismo nombre toma 
	//el primero que encuentre
	System.out.println(pokemones.indexOf("flygon"));
	//buscar el ultimo pokemon y devuelve la poscicion
	//si hay dos elementos con el mismo nombre toma 
	//el ultimo que encuentre
	System.out.println(pokemones.lastIndexOf("flygon"));
	
	//remueve el elemento en la poscicion
	pokemones.remove(5);
	
	//set reemplaza el elemento en la poscicion especificada
	pokemones.set(0, "flareon");
	
	
	//imprimir los pokemon
	for(String pokemon : pokemones) {
		System.out.println(pokemon);
	}
	System.out.println("**");
	System.out.println(pokemones.get(0));//elegir pokemon
	
	
	//****************
	//LinkedList  es una lista doblemente enlazada
	List<String> digimones = new LinkedList<String>();
	digimones.add("Agumon");
	digimones.add("Patamon");
	digimones.add("Angemon");
	digimones.add("Andromon");
	digimones.add("Greymon");	
	
	//Map
	/*
	 Asocia claves a valores, no puede contener claves duplicadas,
	 solo puede tener un valor asociado
	 */
	
	//HashMap
	/*
	 tiene mejor rendimiento pero garantiza un orden
	 a la hora de hacer iteraciones
	 */
	
	Map<Integer, String> usuarios = new HashMap<Integer, String>();
	usuarios.put(1, "Uriel Garcia");
	usuarios.put(2, "Victor Hernandez");
	usuarios.put(3, "Amaury Oprituxine");
	
	System.out.println("*");
	System.out.println(usuarios.get(2));
	
	//key Set
	/*
	 Mapa<key, value>
	 no claves duplicadas
	 */
	System.out.println(usuarios.keySet());
	//values
	//nos permite recuperar el valor directamente
	System.out.println(usuarios.values());
	
	//TreeMap
	Map<String, String> tamales = new TreeMap<String, String>();
	tamales.put("Oaxaqueño","Mole Rojo");
	tamales.put("Torta","Mole Verde");
	tamales.put("Dulces","Gansito");
	tamales.put("Salado","Cochinita");
	
	System.out.println("****");
	System.out.println(tamales.keySet());
	System.out.println(tamales.values());
	
	System.out.println(tamales);
	//tamales.entrySet()
	tamales.entrySet().forEach(elemento -> {
		//Ssyem.out.println(elemento.getKet().toString()+ elemento.getValue().toString());
		System.out.println(elemento.getKey());
		System.out.println(elemento.getValue());
	});
	//LinkedHashSet
	Map<Integer,String> carros=new LinkedHashMap<Integer,String>();
	carros.put(1, "Volvol");
	carros.put(567, "Pointer");
	carros.put(3, "Mustang");
	
	System.out.println(carros.keySet());
	System.out.println(carros.values());
}

}