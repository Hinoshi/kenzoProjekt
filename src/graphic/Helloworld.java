package graphic;

import com.sun.javafx.geom.AreaOp.AddOp;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Helloworld extends javafx.application.Application {

	@Override
	public void start(Stage primaryStage) {
		
		
		Button btn = new Button();
		
		btn.setText("Say hello World ");
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				System.out.println("helloworld");
				
			}
		});
		
		 StackPane root = new StackPane();
		 
		 root.getChildren().add(btn);
		 
		 Scene scene = new Scene(root,300, 250);
		 
		 primaryStage.setTitle("Welcome to helloworld program ");
		 
		 primaryStage.setScene(scene);
		 
		 primaryStage.show();
		 
		 
	}
	public static void main(String[] args) {
	
		launch(args);
		
	}
	
}
