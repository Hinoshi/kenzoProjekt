package javafxLernen;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ErsteProgramm  extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(new Group() , 100 , 100);
		
		primaryStage.setTitle("Willkommen");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		 launch(args);
	}

}
