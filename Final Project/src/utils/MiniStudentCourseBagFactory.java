package utils;

import model.Course;
import model.CourseBag;
import model.CourseStatusesStudent;
import model.LetterGrades;
import model.MiniStudentCourseBag;
import model.MiniStudentInfo;

public class MiniStudentCourseBagFactory {
	
	private static MiniStudentCourseBag miniStudentCourseBag;
	private static String courseNumber;
	private static double numberOfCredits;
	private static LetterGrades letterGrade;
	private static LetterGrades[] letterGrades = LetterGrades.values();
	private static CourseStatusesStudent courseStatus;
	private static CourseStatusesStudent[] courseStatusesStudent = CourseStatusesStudent.values();
	
	
	public static MiniStudentCourseBag emitMiniStudentCourseBag(CourseBag courseBag) {
		
		for (int i=0; i<5; i++) {
			Course course = courseBag.returnRandomCourse();
			System.out.println("1");
			courseNumber = course.getCourseNumber();
			System.out.println("2");
			numberOfCredits = course.getNumberOfCredits();
			System.out.println("3");
			letterGrade = letterGrades[(int)(Math.random() * letterGrades.length + 1)];
			System.out.println("4");
			courseStatus = courseStatusesStudent[(int)(Math.random() * courseStatusesStudent.length)];
			System.out.println("5");
			
			MiniStudentInfo miniStudentInfo = new MiniStudentInfo(courseNumber, numberOfCredits, letterGrade, courseStatus);
			miniStudentCourseBag.insert(miniStudentInfo);
			System.out.println("6");
		}
		
		return miniStudentCourseBag;
	}
}
