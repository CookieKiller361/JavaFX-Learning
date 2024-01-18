package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstUITest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 700, 600);
        Button button = new Button("Test");
        ProgressBar progressBar = new ProgressBar();
        progressBar.setProgress(0.25);
        vBox.getChildren().add(button);
        vBox.getChildren().add(progressBar);
        stage.setScene(scene);
        stage.setTitle("My First GUI");
        stage.setY(300);
        stage.setX(800);
        stage.show();
    }
}
