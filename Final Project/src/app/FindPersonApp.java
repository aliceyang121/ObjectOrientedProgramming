package app;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.College;
import model.Faculty;
import model.Person;
import model.PersonBag;
import model.Student;

public class FindPersonApp {
	
	public static void findPerson(College college) {
		
		PersonBag personBag = college.getPersonBag();
		
		Button btnEnter = new Button("Enter");
		
		TextField fieldId = new TextField();
		fieldId.setPromptText("ID");
		fieldId.setAlignment(Pos.CENTER);
		
		btnEnter.setOnAction(e -> {
			int id = Integer.parseInt(fieldId.getText());
			Person person = personBag.search(id);
			
			if (person.getClass().equals(Student.class)) {
				Student student = (Student) person;
				student.toString();
			}
			
			else {
				Faculty faculty = (Faculty) person;
				faculty.toString();
			}
				
		});
		
		Scene scene = new Scene(fieldId);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Find Person");
		
		stage.show();
	}
		
//		Button btnStudent = new Button("Find a Student");
//		Button btnFaculty = new Button("Find a Faculty");
//		
//		btnStudent.setOnAction(e ->   {
//			findStudent(personBag);
//		});
//		
//		btnFaculty.setOnAction(e ->   {
//			findFaculty(personBag);
//		});
//		
//		GridPane boxFind = new GridPane();
//		
//		boxFind.setVgap(20);
//		boxFind.setHgap(20);
//		
//		boxFind.add(btnStudent, 0, 0);
//		boxFind.add(btnFaculty, 1, 0);
//		
//		boxFind.setAlignment(Pos.CENTER);
//		Scene scene = new Scene(boxFind);
//		Stage stage = new Stage();
//		stage.setScene(scene);
//		stage.setTitle("Find a Person");
//		
//		stage.show();
//	}
//
//	private static void findStudent(PersonBag personBag) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void findFaculty(PersonBag personBag) {
//		// TODO Auto-generated method stub
//		
//	}
}
