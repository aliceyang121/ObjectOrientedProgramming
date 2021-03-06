package model;

public class Faculty extends Person {
	
	private Titles title;
	private double salary;
	private Majors department;
	private String officePhone;
	private MiniFacultyCourseBag miniFacultyCourseBag;

	public Faculty(String firstName, String lastName, Titles title, double salary, Majors department, String officePhone, MiniFacultyCourseBag miniFacultyCourseBag) {
		super(firstName, lastName);
		this.title = title;
		this.salary = salary;
		this.department = department;
		this.officePhone = officePhone;
		this.miniFacultyCourseBag = miniFacultyCourseBag;
	}
	
	public Titles getTitle() {
		return title;
	}


	public void setTitle(Titles title) {
		this.title = title;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Majors getDepartment() {
		return department;
	}


	public void setDepartment(Majors department) {
		this.department = department;
	}


	public String getOfficePhone() {
		return officePhone;
	}


	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}


	@Override
	public String toString() {
		return super.toString() + "Title:\t" + getTitle() + "Salary:\t" + getSalary() + "Department:\t" + getDepartment() + "Office Phone:\t" + getOfficePhone();
	}
}
