package com.example.miniuber.Controller;

import com.example.miniuber.Connection.ConnectionProvider;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.xml.transform.Result;
import java.sql.*;

import static com.example.miniuber.Controller.HelloController.emailadd;
import static com.example.miniuber.Controller.RequestDriverController.dist;
import static com.example.miniuber.calculator.Calculator.price2;
import static com.example.miniuber.calculator.Calculator.type5;

public class EmailController {
    public void EmailOnAction(ActionEvent event) throws SQLException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION,"تم الدفع بنجاح يا احلى يوزر ممكن تطلع بره");
        alert.show();
        System.out.println(emailadd+" "+dist+" "+type5+" "+price2+" ");
        try {
            Connection con = ConnectionProvider.getCon();
            Statement statement = con.createStatement();
            PreparedStatement ps = con.prepareStatement("insert into payment values(?,?,?,?)");
            ps.setString(1,emailadd);
            ps.setString(2,dist);
            ps.setString(3,type5);
            ps.setInt(4,price2);
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            Alert alert1 = new Alert(Alert.AlertType.ERROR,"DatabaseError");
            alert1.show();
        }
    }
}
