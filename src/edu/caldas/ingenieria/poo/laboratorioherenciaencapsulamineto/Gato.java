package edu.caldas.ingenieria.poo.laboratorioherenciaencapsulamineto;

public class Gato extends Animal {

	public Gato(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void hacerSonido(){
		System.out.println(getNombre() + "Miau!");		
	}
	
	public void trepar(){
		System.out.println(getNombre() + "esta trepando");		
	}
	
}
