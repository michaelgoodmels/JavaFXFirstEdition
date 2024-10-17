package com.example.javafxfirstedition;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class JavaFXFirstEditionController {
    @FXML
    private Label SecretText01;

    @FXML
    protected void onSecret01() {
        SecretText01.setText("I'm a Sworbler");
    }

    @FXML
    protected void onSecret02() {
        SecretText01.setText("I'm a Putin understander");
    }

    @FXML
    protected void onSecret03() {
        SecretText01.setText("I'm not vaccinated");
    }
}

