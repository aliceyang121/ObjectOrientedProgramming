package p1;

import java.util.Scanner;

public class Course {
	private String courseNumber;
	private double credits;
	
//METHOD 3
	public Course(String courseNumber, double credits) throws WrongCreditValueException {
		super();
		this.courseNumber = courseNumber;
		if (credits > 4.0 || credits < 0.0) {
			throw new WrongCreditValueException("The credit vaule is incorrect");
		}
// METHOD 1
//			Scanner scanner = new Scanner(System.in);
//			do {
//				System.out.println("Credit value is wrong.");
//				System.out.println("Enter a valid credit number: ");
//				credits = scanner.nextDouble();
//				if (credits >=0 && credits<= 4.0) {
//					break;
//				}
//			} while (true);	
			
// METHOD 2
//			try {
//				throw new WrongCreditValueException();
//			} catch (WrongCreditValueException e) {
//				getANewValue();
//			}
//		}
		this.credits = credits;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	@Override
	public String toString() {
		return "courseNumber=" + courseNumber + ", credits=" + credits;
	}
}
