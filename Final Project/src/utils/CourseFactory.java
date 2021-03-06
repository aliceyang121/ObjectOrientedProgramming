package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Course;
import model.CourseBag;
import data.*;

public class CourseFactory {
	
	private static File file = new File("courses.txt");
	private static String courseNumber;
	private static String courseTitle;
	private static String courseDescription;
	private static double numberOfCredits;
	private static Scanner scanner = null;
	
	public static void emitCourses(CourseBag courseBag) {
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
			e.printStackTrace();
		}	
		
		for (int i=0; i<1000; i++) {
			courseNumber = scanner.nextLine();
			courseTitle = scanner.nextLine();
			courseDescription = scanner.nextLine();
			String stringNumOfCredits = scanner.nextLine();
			numberOfCredits = Double.parseDouble(stringNumOfCredits);
			scanner.nextLine();
			//scanner.nextLine() (DO I NEED???)
			
			Course course = new Course (courseNumber, courseTitle, courseDescription, numberOfCredits);
			courseBag.insert(course);
		}
	}
	
//	public static String emitCourseNumber() {
//			String str = scanner.nextLine();
//			return str;
//		}
//		
//	}
}
