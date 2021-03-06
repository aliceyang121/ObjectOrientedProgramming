package inheritance;

//Person: base class, parent class, super class
//Student: derived class, child class, sub class

//sub class gets all non-private elements from super class
public class Student extends Person {
	
	private double gpa;
	
	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String getId() {
		return "The ID is: " + super.getId();
	}

	public String toString() {
//		return super.toString() + " GPA: " + gpa;  
		return "Name: " + getName() + " ID: " + getId() + " GPA: " + gpa;
	}
	
}
