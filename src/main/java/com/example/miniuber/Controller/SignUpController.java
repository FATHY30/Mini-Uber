package com.example.miniuber.Controller;

import javafx.event.ActionEvent;

import java.io.IOException;

import static com.example.miniuber.SwitchController.SwitchTo;

public class SignUpController {
    public void SwitchToLogin(ActionEvent event) throws IOException {
        SwitchTo(event,"hello-view.fxml");
    }
}
