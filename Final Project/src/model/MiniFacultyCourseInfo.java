package model;

public class MiniFacultyCourseInfo {
	private String courseNumber;
	private String courseTitle;
	private double numberOfCredits;
	private CourseStatusesFaculty courseStatus;
	
	public MiniFacultyCourseInfo(String courseNumber, String courseTitle, double numberOfCredits, CourseStatusesFaculty courseStatus) {
		super();
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.numberOfCredits = numberOfCredits;
		this.courseStatus = courseStatus;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public double getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public CourseStatusesFaculty getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(CourseStatusesFaculty courseStatus) {
		this.courseStatus = courseStatus;
	}
}
