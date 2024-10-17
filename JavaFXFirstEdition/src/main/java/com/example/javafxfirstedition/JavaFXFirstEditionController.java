package com.example.javafxfirstedition;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class JavaFXFirstEditionController {
    @FXML
    private Label SecretText01;

    @FXML
    private Label SecretText02;  // Neues Label hinzugefügt

    @FXML
    protected void onSecret01() {
        SecretText01.setText("I'm a Sworbler");
        SecretText02.setText("dörfen alli wüsse");  // Setze Text im zweiten Label
    }

    @FXML
    protected void onSecret02() {
        SecretText01.setText("I'm a Putin understander");
        SecretText02.setText("aber pssst, niemertem verzelle");  // Setze Text im zweiten Label
    }

    @FXML
    protected void onSecret03() {
        SecretText01.setText("I'm not vaccinated");
        SecretText02.setText("aber pssst, niemertem verzelle");  // Setze Text im zweiten Label
    }
}
