package edu.caldas.ingenieria.poo.gradebook;

import java.util.Scanner;

public class GradeBookTest {
	public GradeBookTest() {
		
	}
	public static void main (String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		GradeBook gradebook = new GradeBook();
		GradeBook gradebookProgramacion00 = new GradeBook("Programacion Orientada a Objetos");
		
		System.out.print("give a course name: ");
		String courseName = sc.nextLine();
		gradebook.setCourseName(courseName);
		System.out.println("Nombre del curso desde el Main() : " + gradebook.getCourseName());
		System.out.println("Nombre del curso conc constructor nombre" + gradebookProgramacion00);
		gradebook.displayMessage(courseName);
		
	}

}