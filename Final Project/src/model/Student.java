package model;

public class Student extends Person {
	
	private double gpa;
	private Majors major;
	private MiniStudentCourseBag miniStudentCourseBag;
	
	public Student(String firstName, String lastName, Majors major, MiniStudentCourseBag miniStudentCourseBag) {
		super(firstName, lastName);
		this.major = major;
		//calculate gpa in miniStudentCourseBag.gpa()
	}
	
	public double getGpa() {
		return miniStudentCourseBag.calculateGpa();
	}

	public Majors getMajor() {
		return major;
	}
	
//	public void setGpa(double gpa) {
//		this.gpa = gpa;
//	}
	
	public void setMajor(Majors major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tGPA: " + gpa + "\tMajor: " + getMajor();
	}
	
}
