package app;

import java.awt.Label;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.College;
import model.Faculty;
import model.Person;
import model.PersonBag;
import model.Student;

public class DeletePersonApp {
	
	public static void deletePerson(College college) {
		
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
				
				// create stage
				Stage stage1 = new Stage();
				stage1.setTitle("Found Student");
				// create label
		        Label label = new Label(student.toString()); 
		        // create a Stack pane 
		        StackPane sp = new StackPane(); 
		        // add password field 
		        sp.getChildren().addAll(label); 
		        // create a scene 
		        Scene scene = new Scene(sp); 
		        // set the scene 
		        stage1.setScene(scene); 
		  
		        stage1.show(); 
			}
			
			else {
				Faculty faculty = (Faculty) person;
				
				// create stage
				Stage stage1 = new Stage();
				stage1.setTitle("Found Faculty");
				// create label
		        Label label = new Label(faculty.toString()); 
		        // create a Stack pane 
		        StackPane sp = new StackPane(); 
		        // add password field 
		        sp.getChildren().addAll(label); 
		        // create a scene 
		        Scene scene = new Scene(sp); 
		        // set the scene 
		        stage1.setScene(scene); 
		  
		        stage1.show();
			}
				
		});
		
		Scene scene = new Scene(fieldId);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Find Person");
		
		stage.show();
	}

}