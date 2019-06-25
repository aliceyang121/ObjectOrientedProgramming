package access_modifiers;

public class Student extends Person { // this is a is - a relationship
	
	private double gpa;
	private Textbook textbook;
	private CoursesBag[] courses;
	
	public Student(String firstName, double gpa) {
		super(firstName);
		this.gpa = gpa;

	}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tGPA: " + gpa;
	}
	
	// inner class: private inner class that only Student class can access
	private class Textbook {
		
	}
	
}
