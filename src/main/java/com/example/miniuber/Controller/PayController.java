package com.example.miniuber.Controller;

import com.example.miniuber.Connection.ConnectionProvider;
import com.example.miniuber.Pay.*;
import com.example.miniuber.calculator.Calculator;
import javafx.event.ActionEvent;

import com.example.miniuber.calculator.Calculator.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import com.example.miniuber.Controller.RequestDriverController.*;

import static com.example.miniuber.Controller.HelloController.emailadd;
import static com.example.miniuber.Controller.RequestDriverController.dist;
import static com.example.miniuber.SwitchController.OpenPage;
import static com.example.miniuber.calculator.CalculateXYCoordinate.From5;
import static com.example.miniuber.calculator.CalculateXYCoordinate.To5;
import static com.example.miniuber.calculator.Calculator.price2;
import static com.example.miniuber.calculator.Calculator.type5;

public class PayController implements Initializable{
    @FXML
    private Label from;
    @FXML
    private Label to;
    @FXML
    private Label price;
    @FXML
    private Label type;
    @FXML
    private Button CreditCard;
    @FXML
    private Button Paypal;
    private PaymentManager paymentManager = new PaymentManager();
    String cardNumber,name,date,cvv,email="a";
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    public void CashOnAction(ActionEvent e) throws SQLException {
        paymentManager.setPaymentStrategy(new CashPaymentStrategy());
        alert.setContentText("You paid "+price.getText()+" Successfully");
        alert.setHeaderText("Success");
        alert.show();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement statement = con.createStatement();
            PreparedStatement ps = con.prepareStatement("insert into payment values(?,?,?,?)");
            ps.setString(1, emailadd);
            ps.setString(2, dist);
            ps.setString(3, type5);
            ps.setInt(4, price2);
            ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
            Alert alert1 = new Alert(Alert.AlertType.ERROR,"DatabaseError");
            alert1.show();
        }
    }

    public void CreditCardOnAction(ActionEvent e) throws IOException {
        paymentManager.setPaymentStrategy(new CreditCardPaymentStrategy(cardNumber, name, date, cvv));
        OpenPage(CreditCard,"CreditCardPayment.fxml",600,500);
    }
    public void PaypalOnAction(ActionEvent e) throws IOException {
        paymentManager.setPaymentStrategy(new PayPalPaymentStrategy(email));
        OpenPage(Paypal,"Email.fxml",400,200);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        from.setText(From5);
        to.setText(To5);
        type.setText(type5);
        price.setText(String.valueOf(price2));
    }
}
