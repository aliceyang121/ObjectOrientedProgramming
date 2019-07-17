package model;

public class MiniStudentInfo {
	private String courseNumber;
	private double numberOfCredits;
	private LetterGrades letterGrade;
	private CourseStatusesStudent courseStatus;
	
	public MiniStudentInfo (String courseNumber, double numberOfCredits, LetterGrades letterGrade, CourseStatusesStudent courseStatus) {
		this.courseNumber = courseNumber;
		this.numberOfCredits = numberOfCredits;
		this.letterGrade = letterGrade;
		this.courseStatus = courseStatus;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public double getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public LetterGrades getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(LetterGrades letterGrade) {
		this.letterGrade = letterGrade;
	}

	public CourseStatusesStudent getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(CourseStatusesStudent courseStatus) {
		this.courseStatus = courseStatus;
	}
	
	
}
