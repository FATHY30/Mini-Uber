package com.example.miniuber.Controller;

import com.example.miniuber.Connection.ConnectionProvider;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.sql.*;

import static com.example.miniuber.Controller.HelloController.emailadd;
import static com.example.miniuber.Controller.RequestDriverController.dist;
import static com.example.miniuber.calculator.Calculator.price2;
import static com.example.miniuber.calculator.Calculator.type5;

public class CreditCardController {
    public void PayButtonOnAction(ActionEvent e) throws SQLException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION,"يعطيك العافية تم الدفع اخرج بقى");
        alert.show();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement statement = con.createStatement();
            PreparedStatement ps = con.prepareStatement("insert into payment values(?,?,?,?)");
            ps.setString(1,emailadd);
            ps.setString(2,dist);
            ps.setString(3,type5);
            ps.setInt(4,price2);
            ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
            alert = new Alert(Alert.AlertType.ERROR,"Database Error");
            alert.show();
        }
    }
}
