package com.example.miniuber.Controller;

import com.example.miniuber.Connection.ConnectionProvider;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import static com.example.miniuber.SwitchController.SwitchTo;

public class SignUpController {
    @FXML
    private TextField emailAddressField;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField phoneNumberField;
    public void SwitchToLogin(ActionEvent event) throws IOException {
        SwitchTo(event,"hello-view.fxml");
    }
    public void SignUpOnAction(ActionEvent e){
        String EmailAddress = emailAddressField.getText();
        String Username = usernameField.getText();
        String Password = passwordField.getText();
        String Phone = phoneNumberField.getText();
        Alert alert = new Alert(Alert.AlertType.NONE);
        try {
            Connection con = ConnectionProvider.getCon();
            assert con != null;
            PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?)");
            ps.setString(1,Username);
            ps.setString(2,EmailAddress);
            ps.setString(3,Password);
            ps.setString(4,Phone);
            ps.executeUpdate();
            ImageView imageView = new ImageView("C:\\Users\\dell\\Desktop\\Mini-Uber\\Mini-Uber\\src\\main\\resources\\com\\example\\miniuber\\Images\\check-mark.png");
            imageView.setFitHeight(50);
            imageView.setFitWidth(50);
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setHeaderText("");
            alert.setContentText("Successfully Saved");
            alert.setTitle("Information");
            alert.setGraphic(imageView);
            alert.showAndWait();
        }catch (Exception ex){
            ex.printStackTrace();
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Database Error");
            alert.show();
        }
    }
}
