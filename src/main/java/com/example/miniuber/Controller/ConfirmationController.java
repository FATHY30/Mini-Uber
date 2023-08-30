package com.example.miniuber.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ConfirmationController {
    @FXML
    private Label confirmationLabel;

    public void setConfirmationText(String requestType) {
        String confirmationText = "Your " + requestType + " Handling...\nWe will call you soon.";
        confirmationLabel.setText(confirmationText);
    }


}
