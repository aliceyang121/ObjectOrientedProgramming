package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Course;

public class CourseFactory {
	
	private static File file = new File("course_inventory.txt");
	private static 
	
	public static Course emitCourse() {
		try {
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
//			e.printStackTrace();
		}	
		
		
		
		Course course = new Course (emitCourseNumber(), emitCourseTitle(), emitCourseDescription(), emitNumberOfCredits());
		return course;
	}
	
//	public static String emitCourseNumber() {
//			String str = scanner.nextLine();
//			return str;
//		}
//		
//	}
}
