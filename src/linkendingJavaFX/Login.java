package linkendingJavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login  extends Application{

	
	 @Override
	 public void start(Stage primaryStage) throws Exception {


		 GridPane grid = new GridPane() ;  // um die Rahmen zu erstellen 
		 
		 // die Werte hgap und Vgap können als parameter der Konstruktor einfugen 
		 
		 grid.setAlignment(Pos.CENTER);
		 
		 grid.setHgap(10);
		 
		 grid.setVgap(10);
		 grid.setPadding(new Insets(25,25,25,25));

		 Text scenetitele = new Text("Please Login") ;
		 
		 scenetitele.setFont(Font.font("Tahoma" , FontWeight.NORMAL , 20));
		 
		 Label username = new Label("username : ") ;
		 TextField userTextField = new TextField(); 
		 
		 Label Password = new Label(" Password") ;
		 
		 PasswordField passwordField = new PasswordField() ; 
		
		 grid.add(scenetitele, 0, 0 ,2 ,1);
		 grid.add(username, 0, 1);
		 grid.add(userTextField, 1, 1);
		 grid.add(passwordField, 1, 2);
		 grid.add(Password, 0, 2);
		 
		  // für anzeigen 
		 
		 grid.setGridLinesVisible(false); // true um Line zu zeigen 
		 
		 
		 
		 Button but = new Button("Sign in ") ;
		 HBox hbt = new HBox(10); //  der double Parametre dient  zur Spacing und extend pane 
		 hbt.setAlignment(Pos.BOTTOM_RIGHT);
		 hbt.getChildren().add(but);
		 
		 grid.add(hbt, 1, 4);
		 
		 final Text actiontarget  = new Text(); 
		 grid.add(actiontarget, 1, 6);
		 
		 but.setOnAction(event -> {
			 
			 actiontarget.setFill(Color.FIREBRICK) ; 
			 actiontarget.setText("Sign in button pressed") ;
			 
		 });
		 
		 Scene scene = new Scene(grid ,200 , 200) ;
		 
		 // Einfügen von css 
		 scene.getStylesheets().
		 		add(Login.class.getResource("login.css").toExternalForm());
		 
		 primaryStage.setTitle("Loginexample");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		
	 }
	 
	 public static void main(String[] args) {
		
		 launch(args);
	}


}
