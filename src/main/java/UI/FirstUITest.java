package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FirstUITest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 700, 600);
        Label label = new Label("Test, Test");
        label.setTextFill(Color.WHITE);
        VBox.setMargin(label, new javafx.geometry.Insets(0, 100, 0, 300)); // Ändere die Position um 20 Pixel von oben und 50 Pixel von links
        label.setFont(new Font(30));
        vBox.setStyle("-fx-background-color: blue;");
        Button button = new Button("Test");
        ProgressBar progressBar = new ProgressBar();
        progressBar.setProgress(0.25);
        vBox.getChildren().add(label);
        vBox.getChildren().add(button);
        vBox.getChildren().add(progressBar);
        stage.setScene(scene);
        stage.setTitle("My First GUI");
        stage.setY(300);
        stage.setX(800);
        stage.show();
    }
}
