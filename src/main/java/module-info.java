module UI {
    requires javafx.controls;
    requires javafx.fxml;


    opens UI to javafx.fxml, javafx.graphics;
    exports UI;


    // And other module-related declarations...


}