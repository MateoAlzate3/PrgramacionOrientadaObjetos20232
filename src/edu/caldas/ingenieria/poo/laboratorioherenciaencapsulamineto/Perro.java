package edu.caldas.ingenieria.poo.laboratorioherenciaencapsulamineto;

public class Perro extends Animal {

	public Perro(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void hacerSonido(){
		System.out.println(getNombre() + "Guau!");		
	}
	
	public void correr(){
		System.out.println(getNombre() + "esta corriendo");		
	}
}
