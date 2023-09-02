package com.example.miniuber.Controller;

import com.example.miniuber.Connection.ConnectionProvider;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import static com.example.miniuber.Controller.HelloController.usName;

public class UserInfoController implements Initializable {
    @FXML
    private Label userNameField;
    @FXML
    private Label emailField;
    @FXML
    private Label phoneField;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user where username = '"+usName+"'");
            while (resultSet.next()){
                userNameField.setText(resultSet.getString(1));
                emailField.setText(resultSet.getString(2));
                phoneField.setText(resultSet.getString(4));
            }
        }catch (Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR,"Database Error");
            alert.show();
            ex.printStackTrace();
        }
    }
}
