package utils;

import model.Course;
import model.CourseBag;
import model.CourseStatusesFaculty;
import model.MiniFacultyCourseBag;
import model.MiniFacultyCourseInfo;

public class MiniFacultyCourseBagFactory {
	
	private static MiniFacultyCourseBag miniFacultyCourseBag;
	private static String courseNumber;
	private static String courseTitle;
	private static double numberOfCredits;
	private static CourseStatusesFaculty courseStatus;
	private static CourseStatusesFaculty[] courseStatusesFaculty = CourseStatusesFaculty.values();

	
	public static MiniFacultyCourseBag emitMiniFacultyCourseBag(CourseBag courseBag) {
		
		for (int i=0; i<5; i++) {
			Course course = courseBag.returnRandomCourse();
			courseNumber = course.getCourseNumber();
			courseTitle = course.getCourseTitle();
			numberOfCredits = course.getNumberOfCredits();
			courseStatus = courseStatusesFaculty[(int)(Math.random() * ((courseStatusesFaculty.length) + 1))];

			MiniFacultyCourseInfo miniFacultyCourseInfo = new MiniFacultyCourseInfo(courseNumber, courseTitle, numberOfCredits, courseStatus);
			miniFacultyCourseBag.insert(miniFacultyCourseInfo);
		}
		
		return miniFacultyCourseBag;
	}
}
