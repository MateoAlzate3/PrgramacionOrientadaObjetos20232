package edu.caldas.ingenieria.poo.gradebook;

public class GradeBook {
	
	private String courseName;
		
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	public void displayMessage(String course)
	{
		System.out.print(" hello from GadeBook class " + getCourseName());
	}

}