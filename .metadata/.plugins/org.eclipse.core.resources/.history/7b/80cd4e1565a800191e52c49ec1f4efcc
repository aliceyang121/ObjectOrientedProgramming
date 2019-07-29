package app;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.College;
import model.CourseStatusesFaculty;
import model.CourseStatusesStudent;
import model.LetterGrades;
import model.Majors;
import model.MiniStudentCourseBag;
import model.MiniStudentInfo;
import model.PersonBag;
import model.Student;


public class InsertPersonApp {

	public static void insertPerson(College college) {
		
		PersonBag personBag = college.getPersonBag();
		
		Button btnStudent = new Button("Insert a Student");
		Button btnFaculty = new Button("Insert a Faculty");
		
		btnStudent.setOnAction(e ->   {
			insertStudent(personBag);
		});
		
		btnStudent.setOnAction(e ->   {
			insertFaculty(personBag);
		});
	}

	private static void insertStudent(PersonBag personBag) {
		Button btnEnter = new Button("Enter");
		
		TextField fieldFirstName = new TextField();
		TextField fieldLastName = new TextField();
		TextField fieldMajor = new TextField();
		TextField fieldCourse1 = new TextField();
		TextField fieldLetterGrade1 = new TextField();
		TextField fieldCourseStatus1 = new TextField();
		
		fieldFirstName.setPromptText("First Name");
		fieldLastName.setPromptText("Last Name");
		fieldMajor.setPromptText("Major");
		fieldCourse1.setPromptText("Course Number");
		fieldLetterGrade1.setPromptText("Letter Grade");
		fieldCourseStatus1.setPromptText("Course Status");
		
		GridPane boxStudent = new GridPane();
		
		boxStudent.setVgap(20);
		boxStudent.setHgap(20);
		
		boxStudent.add(fieldFirstName, 0, 0);
		boxStudent.add(fieldLastName, 0, 1);
		boxStudent.add(fieldMajor, 0, 2);
		boxStudent.add(fieldCourse1, 0, 3);
		boxStudent.add(fieldLetterGrade1, 0, 4);
		boxStudent.add(fieldCourseStatus1, 0, 5);
		boxStudent.add(btnEnter, 0, 6);

		btnEnter.setOnAction(e ->   {
			String firstName = fieldFirstName.getText();
			String lastName = fieldLastName.getText();
			Majors major = Majors.valueOf(fieldMajor.getText());
			String courseNumber = fieldCourse1.getText();
			//DOUBLE CREDITS PROBLEM
			double numberOfCredits = 2.0;
			LetterGrades letterGrade = LetterGrades.valueOf(fieldLetterGrade1.getText());
			CourseStatusesStudent courseStatus = CourseStatusesStudent.valueOf(fieldCourseStatus1.getText());
			
			MiniStudentInfo miniStudentInfo = new MiniStudentInfo(courseNumber, numberOfCredits, letterGrade, courseStatus);
			MiniStudentCourseBag miniStudentCourseBag = new MiniStudentCourseBag(10);
			miniStudentCourseBag.insert(miniStudentInfo);
			Student student = new Student (firstName, lastName, major, miniStudentCourseBag);
			personBag.insert(student);
		});
		
		boxStudent.setAlignment(Pos.CENTER);
		Scene scene = new Scene(boxStudent); // add the container onto the scene
		Stage stage = new Stage();
		stage.setScene(scene); // set scene onto the stage
		stage.setTitle("Insert Student");
		stage.setWidth(500);
		stage.setHeight(500);

		stage.show();
	}
	
	private static void insertFaculty(PersonBag personBag) {
		Button btnEnter = new Button("Enter");
		
		TextField fieldFirstName = new TextField();
		TextField fieldLastName = new TextField();
		TextField fieldTitle = new TextField();
		TextField fieldSalary = new TextField();
		TextField fieldDepartment = new TextField();
		TextField fieldOfficePhone = new TextField();
		TextField fieldCourseNumber = new TextField();
		TextField fieldCourseStatus = new TextField();
		
		fieldFirstName.setPromptText("First Name");
		fieldLastName.setPromptText("Last Name");
		fieldTitle.setPromptText("Title");
		fieldSalary.setPromptText("Salary");
		fieldDepartment.setPromptText("Department");
		fieldOfficePhone.setPromptText("Office Phone Number");
		
		
		GridPane boxStudent = new GridPane();
		
		boxStudent.setVgap(20);
		boxStudent.setHgap(20);
		
		boxStudent.add(fieldFirstName, 0, 0);
		boxStudent.add(fieldLastName, 0, 1);
		boxStudent.add(fieldTitle, 0, 2);
		boxStudent.add(fieldSalary, 0, 3);
		boxStudent.add(fieldDepartment, 0, 4);
		boxStudent.add(fieldOfficePhone, 0, 5);
		boxStudent.add(btnEnter, 0, 6);

		btnEnter.setOnAction(e ->   {
			String firstName = fieldFirstName.getText();
			String lastName = fieldLastName.getText();
			Majors major = Majors.valueOf(fieldTitle.getText());
			String courseNumber = fieldSalary.getText();
			double numberOfCredits = 2.0;
			LetterGrades letterGrade = LetterGrades.valueOf(fieldDepartment.getText());
			CourseStatusesStudent courseStatus = CourseStatusesStudent.valueOf(fieldOfficePhone.getText());
			
			MiniStudentInfo miniStudentInfo = new MiniStudentInfo(courseNumber, numberOfCredits, letterGrade, courseStatus);
			MiniStudentCourseBag miniStudentCourseBag = new MiniStudentCourseBag(10);
			miniStudentCourseBag.insert(miniStudentInfo);
			Student student = new Student (firstName, lastName, major, miniStudentCourseBag);
			personBag.insert(student);
		});
		
		boxStudent.setAlignment(Pos.CENTER);
		Scene scene = new Scene(boxStudent); // add the container onto the scene
		Stage stage = new Stage();
		stage.setScene(scene); // set scene onto the stage
		stage.setTitle("Insert Student");
		stage.setWidth(500);
		stage.setHeight(500);

		stage.show();
	}
}
