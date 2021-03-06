package hw06;

public class Student extends Person {
	
	private double gpa;
	private String major;
	private String course;
	
	public Student(String firstName, String lastName, long phoneNumber, double gpa, String major, String course) {
		super(firstName, lastName, phoneNumber);
		this.gpa = gpa;
		this.major = major;
		this.course = course;
	}
	
	public double getGpa() {
		return gpa;
	}

	public String getMajor() {
		return major;
	}

	public String getCourse() {
		return course;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tGPA: " + gpa + "\tMajor: " + getMajor() + "\tCourse: " + getCourse();
	}
	
}
