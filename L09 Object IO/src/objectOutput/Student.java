package objectOutput;

import java.io.Serializable;

public class Student extends Person implements Serializable {	//Serializable is an interface
	private String name;
	private double gpa;
	
	public Student(String id, String name, double gpa) {
		super(id);
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", name=" + name + ", gpa=" + gpa;
	}
	
	
}
