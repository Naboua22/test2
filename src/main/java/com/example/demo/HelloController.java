package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField emailText;
    @FXML
    private PasswordField passwordText;

    @FXML
    protected void getLogin(ActionEvent event) {

        String email = emailText.getText();
        String password = passwordText.getText();
        String params = email + "   " + password;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setContentText(params);

        alert.showAndWait();
    }
}