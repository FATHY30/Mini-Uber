package com.example.miniuber.Controller;
import com.example.miniuber.support.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.example.miniuber.SwitchController.OpenPage;

public class SupportController {
    @FXML
    private ComboBox<String> requestTypeChoiceBox;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private Button submit;
    private Map <String, Request > strategyMap=new HashMap<> ();

    public SupportController() {
        strategyMap.put("Complaint", new ComplaintRequest ());
        strategyMap.put("Support", new SupportRequest ());
        strategyMap.put("Refund", new RefundRequest ());
        System.out.println (  "in Constructor" );
    }
    public void submitOnAction(ActionEvent event) {
        //get the type request from combo box
        String selectedRequestType = requestTypeChoiceBox.getValue();
        //get the text area
        String description = descriptionTextArea.getText();
        ImageView imageView= new ImageView("D:\\College's projects\\Mini-Uber\\src\\main\\resources\\com\\example\\miniuber\\Images\\support-ticket.jpg");
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        if (selectedRequestType != null && !description.isEmpty()) {
            System.out.println (  "not null" );
            Request type = strategyMap.get(selectedRequestType);
            if (type != null) {
                CustomerRequest customerRequest = new CustomerRequest(type, description);
                customerRequest.handleRequest();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Your " + selectedRequestType + " Handling...\nWe will call you soon.");
                alert.setGraphic(imageView);
                alert.setTitle("");
                alert.show();
            }
        }
    }
}

