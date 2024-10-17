package com.example.javafxfirstedition;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class JavaFXFirstEditionController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSecret01() {
        welcomeText.setText("I'm a Sworbler");
    }
}