package com.example.miniuber.Controller;

import com.example.miniuber.SwitchController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

import static com.example.miniuber.SwitchController.OpenPage;
import static com.example.miniuber.SwitchController.SwitchTo;

public class MainPageController {
    @FXML
    private Button RequestRiderButton;
    @FXML
    private Button PaymentButton;
    @FXML
    private Button SupportButton;
    @FXML
    private Button UserInfoButton;
    @FXML
    private Button ExitButton;
    public void RequestRiderButtonOnAction(ActionEvent event) throws IOException {
        OpenPage(RequestRiderButton,"RequestRide.fxml",700,500);
    }
    public void PaymentButtonOnAction(ActionEvent event) throws IOException {
        OpenPage(PaymentButton,"Payments.fxml",800,550);
    }
    public void SupportButtonOnAction(ActionEvent event) throws IOException {
        OpenPage(SupportButton,"Support.fxml",600,430);
    }
    public void UserInfoButtonOnAction(ActionEvent event) throws IOException {
        OpenPage(UserInfoButton,"UserInfo.fxml",600,320);
    }
    public void ExitButtonOnAction(ActionEvent event) throws IOException {
        SwitchTo(event,"hello-view.fxml");
    }

}
