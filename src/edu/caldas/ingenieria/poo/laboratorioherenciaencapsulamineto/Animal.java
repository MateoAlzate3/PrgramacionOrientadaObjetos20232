package edu.caldas.ingenieria.poo.laboratorioherenciaencapsulamineto;

public class Animal {
	
	private String nombre;
	private String raza;
	private int edad;
	
	public Animal(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;		
	}
	
	public void comer(){
		System.out.println(nombre + "esta comiendo");		
	}
	
	public void hacerSonido(){
		System.out.println("hacer un sonido");		
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}
}
