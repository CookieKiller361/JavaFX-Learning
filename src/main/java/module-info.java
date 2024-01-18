module org.example.javafxlearn {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxlearn to javafx.fxml;
    exports org.example.javafxlearn;

    opens UI to javafx.fxml, javafx.graphics;

    exports UI;

    // And other module-related declarations...


}