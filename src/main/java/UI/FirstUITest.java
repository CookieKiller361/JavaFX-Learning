package UI;

import javafx.application.Application;
import javafx.stage.Stage;

public class FirstUITest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Moin Meister");
        stage.setHeight(300);
        stage.setWidth(500);
        stage.setY(300);
        stage.setX(800);
        stage.show();
    }
}
