package p1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class MyDemo extends Application {

	public static void main(String[] args) {
		//E(fx)clipse plugin install
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
//		College college = new College();	//college class has a course bag, personbag, etc.
//		GridPaneContainer gridPaneContainer = new GridPaneContainer(college); //contains all gui (everything below until creating scene)
		
//		Stage stage2 = new Stage();
//		stage2.setTitle("stage2");
//		stage2.showAndWait();
		
		Label l1 = new Label("Name");
		Label l2 = new Label("ID");
		Label l3 = new Label("GPA");

		
		Button btn1 = new Button("Insert");	//control
		Button btn2 = new Button("Search");
		Button btn3 = new Button("Delete");
		
		TextField field1 = new TextField();
		TextField field2 = new TextField();
		TextField field3 = new TextField();
		
		field1.setPromptText("Name");
		field2.setPromptText("ID");
		field3.setPromptText("GPA");
		
		HBox hbox1 = new HBox(20);
		hbox1.getChildren().addAll(l1, field1, btn1);
		hbox1.setAlignment(Pos.CENTER);
		HBox hbox2 = new HBox(20);
		hbox2.getChildren().addAll(l2, field2, btn2);
		hbox2.setAlignment(Pos.CENTER);
		HBox hbox3 = new HBox(20);
		hbox3.getChildren().addAll(l3, field3, btn3);
		hbox3.setAlignment(Pos.CENTER);

		
		btn1.setPrefSize(75, 20);
		btn2.setPrefSize(75, 20);
		btn3.setPrefSize(75, 20);
		
		btn1.setOnAction(e -> {
//			System.out.println(field1.getText());
			String name = field1.getText();
			String id = field2.getText();
			String gpa = field3.getText();
			
			l1.setText(name);
			l2.setText(id);
			l3.setText(gpa);
			
//			Student s = new Student(name, id, gpa);
//			personBag.insert(s);
		});
		
		btn2.setOnAction(e -> {
//			System.out.println(field2.getText());
		});
		
		btn3.setOnAction(e -> {
//			System.out.println(field3.getText());
		});
		
//		VBox box1 = new VBox(20);	//container	-- argument changes space between buttons
				//HBox gives it horizontally
		GridPane box1 = new GridPane();
		GridPane box2 = new GridPane();
		GridPane box3 = new GridPane();

		
		box1.setVgap(20);
		box1.setHgap(20);
		
		box1.add(l1, 0, 0);
		box1.add(field1, 1, 0);
		box1.add(btn1, 2, 0);
		
		box2.add(l2, 0, 1);
		box2.add(field2, 1, 1);
		box2.add(btn2, 2, 1);
		
		box3.add(l3, 0, 2);
		box3.add(field3, 1, 2);
		box3.add(btn3, 2, 2);
		
//		ListView listView = new ListView();
//		box1.add(listView, 0, 3, 3, 5);

		
//		box1.getChildren().addAll(btn1, btn2, btn3);	//adding controls into the container
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().addAll(hbox1, hbox2, hbox3);
		
		Scene scene = new Scene(box1);	// add the container onto the scene
		
		stage.setScene(scene);	//set scene onto the stage
		stage.setTitle("stage1");
		stage.setWidth(500);
		stage.setHeight(500);
		stage.show();

	}

}
