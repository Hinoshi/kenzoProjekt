package graphic;

//Hier ist ein vollständiges, lauffähiges JavaFX-Beispiel für eine kleine GUI-Anwendung, die einen Button und ein Textfeld enthält.
//Das Programm zeigt, wie man JavaFX initialisiert, ein Layout erstellt und Events behandelt.
//
//JavaFX Beispielcode
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Einfaches JavaFX-Beispiel:
 * - Textfeld für Eingabe
 * - Button zum Anzeigen einer Begrüßung
 * - Label zur Ausgabe
 */
public class HelloJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // UI-Elemente erstellen
        Label label = new Label("Gib deinen Namen ein:");
        TextField textField = new TextField();
        Button button = new Button("Sag Hallo");
        Label outputLabel = new Label();

        // Button-Event: Begrüßung anzeigen
        button.setOnAction(e -> {
            String name = textField.getText().trim();
            if (name.isEmpty()) {
                outputLabel.setText("Bitte einen Namen eingeben!");
            } else {
                outputLabel.setText("Hallo, " + name + "!");
            }
        });

        // Layout (VBox = vertikale Anordnung)
        VBox root = new VBox(10); // 10px Abstand
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        root.getChildren().addAll(label, textField, button, outputLabel);

        // Szene erstellen und anzeigen
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("JavaFX Beispiel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Startet die JavaFX-Anwendung
    }
}


//Ausführen mit JavaFX (Java 11+)
//Falls du Java 11 oder neuer nutzt, musst du JavaFX-Bibliotheken separat einbinden.
//Mit Maven z. B. in der pom.xml:
//Xml<dependencies>
//    <dependency>
//        <groupId>org.openjfx</groupId>
//        <artifactId>javafx-controls</artifactId>
//        <version>21.0.2</version>
//    </dependency>
//</dependencies>
//
//Oder beim manuellen Start (Beispiel für Windows, Pfade anpassen):
//Bashjava --module-path "C:\javafx-sdk-21\lib" --add-modules javafx.controls HelloJavaFX
//
//
//✅ Features dieses Beispiels:
//
//Einfache GUI mit Label, Textfeld und Button
//Event-Handling mit Lambda-Ausdrücken
//Layout mit VBox und CSS-ähnlicher Inline-Formatierung
//Robuste Eingabeprüfung (leere Eingaben werden abgefangen)
//
//
//Wenn du möchtest, kann ich dir auch ein JavaFX-Beispiel mit Scene Builder und FXML erstellen, damit du die Oberfläche per Drag & Drop gestalten kannst.
//Möchtest du, dass ich dir diese Version auch zeige?
