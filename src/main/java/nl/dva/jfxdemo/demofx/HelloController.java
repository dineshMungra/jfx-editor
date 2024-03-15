package nl.dva.jfxdemo.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.web.HTMLEditor;
import javafx.scene.control.TitledPane;

public class HelloController {
    @FXML
    private TitledPane mainTitledPane;
    @FXML
    private Label welcomeText;
    @FXML
    private HTMLEditor htmlEditor;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}