package com.example.miniuber.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import static com.example.miniuber.SwitchController.SwitchTo;
public class HelloController {
    public void SwitchToSignUp(ActionEvent event) throws IOException {
        SwitchTo(event,"SignUp.fxml");
    }
    public void SwitchToMain(ActionEvent e) throws IOException{
        SwitchTo(e,"MainPage.fxml");
    }
}