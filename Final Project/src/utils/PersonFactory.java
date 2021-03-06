package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.CourseBag;
import model.Faculty;
import model.Majors;
import model.MiniFacultyCourseBag;
import model.MiniStudentCourseBag;
import model.PersonBag;
import model.Student;
import model.Titles;

public class PersonFactory {
	
	private static File first_names = new File("firstNames.txt");
	private static File last_names = new File("lastNames.txt");
	private static Scanner scanner1 = null;
	private static Scanner scanner2 = null;
	private static String firstName;
	private static String lastName;
	//for student
	private static Majors major;
	private static Majors[] majors = Majors.values();
	private static MiniStudentCourseBag miniStudentCourseBag;
	//for faculty
	private static Titles title;
	private static Titles[] titles = Titles.values();
	private static double salary;
	private static Majors department;
	private static String officePhone;
	private static MiniFacultyCourseBag miniFacultyCourseBag;
//	private static int count;	// this is for the ID if needed

	public static void emitPersons(PersonBag personBag, CourseBag courseBag) {
		emitStudents(personBag, courseBag);
		emitFaculty(personBag, courseBag);
	}

	private static void emitStudents(PersonBag personBag, CourseBag courseBag) {
		try {
			scanner1 = new Scanner(first_names);
			scanner2 = new Scanner (last_names);
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
//			e.printStackTrace();
		}
		
		for (int i=0; i<2000; i++) {
			
			firstName = scanner1.nextLine();
			lastName = scanner2.nextLine();
			major = majors[(int)(Math.random() * ((majors.length) + 1))];
			miniStudentCourseBag = MiniStudentCourseBagFactory.emitMiniStudentCourseBag(courseBag);
			
			Student student = new Student (firstName, lastName, major, miniStudentCourseBag);
			personBag.insert(student);	
		}
	}
	
	private static void emitFaculty(PersonBag personBag, CourseBag courseBag) {
		try {
			scanner1 = new Scanner(first_names);
			scanner2 = new Scanner (last_names);
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
//			e.printStackTrace();
		}
		
		for (int i=0; i<500; i++) {
			
			firstName = scanner1.nextLine();
			lastName = scanner2.nextLine();
			title = titles[(int)(Math.random() * ((titles.length) + 1))];
			salary = (double)((int) (Math.random() * (9000000) + 1000000));
			department = majors[(int)(Math.random() * ((majors.length) + 1))];
			officePhone = ((int) (Math.random() * (9000000) + 1000000)) + "";
			miniFacultyCourseBag = MiniFacultyCourseBagFactory.emitMiniFacultyCourseBag(courseBag);
			
			Faculty faculty = new Faculty (firstName, lastName, title, salary, department, officePhone, miniFacultyCourseBag);
			personBag.insert(faculty);	
		}
	}
}
