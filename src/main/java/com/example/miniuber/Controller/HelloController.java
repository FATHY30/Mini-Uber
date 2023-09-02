package com.example.miniuber.Controller;

import com.example.miniuber.Connection.ConnectionProvider;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.example.miniuber.SwitchController.SwitchTo;
public class HelloController {
    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;
    @FXML
    private Label invalidInput;
    public static String usName;
    public static String emailadd;
    public void SwitchToSignUp(ActionEvent event) throws IOException {
        SwitchTo(event,"SignUp.fxml");
    }
    public void messageController(ActionEvent event) throws IOException{
        if(Username.isFocused() || Password.isFocused()){
            invalidInput.setVisible(false);
        }
    }
    public void SwitchToMain(ActionEvent e) throws IOException{
        Boolean found =false;
        try {
            Connection con = ConnectionProvider.getCon();
            assert con != null;
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from user where username = '"+Username.getText()+"' and password = '"+Password.getText()+"'");
            while (rs.next()){
                emailadd = rs.getString(2);
                found = true;
            }
            if(found){
                usName = Username.getText();
                SwitchTo(e,"MainPage.fxml");
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR,"Invalid Username or Password");
                invalidInput.setText("Invalid Username or Passsword");
                invalidInput.setVisible(true);
            }
        }catch (Exception exception){
            Alert alert = new Alert(Alert.AlertType.ERROR,"Database Error");
            alert.show();
            exception.printStackTrace();
        }
    }
}