package com.example.miniuber.Controller;

import com.example.miniuber.Connection.ConnectionProvider;
import com.example.miniuber.calculator.CalculateXYCoordinate;
import com.example.miniuber.calculator.DistanceCalcuator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import com.example.miniuber.calculator.*;

import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

import static com.example.miniuber.SwitchController.OpenPage;
import static com.example.miniuber.calculator.CalculateXYCoordinate.From5;
import static com.example.miniuber.calculator.CalculateXYCoordinate.To5;
import static com.example.miniuber.calculator.Calculator.type5;

public class RequestDriverController implements Initializable{
    @FXML
    private Label distance2;
    @FXML
    private ComboBox type;
    @FXML
    private Button Pay;
    @FXML
    private Label price;
    @FXML
    private TextField FromLabel;
    @FXML
    private TextField ToLabel;
    public static String dist;

    String types[] = {"Normal","Premium","MotorBike","Bus"};
    public void submit(ActionEvent event) {
        try {
            CalculateXYCoordinate coordinate=new CalculateXYCoordinate();
            DistanceCalcuator distance=new DistanceCalcuator();
            distance.normal_ride(coordinate.getFromX(), coordinate.getFromY(), coordinate.getToX(), coordinate.getToY());
            String string=Integer .toString(distance.get_distance());
            distance2.setText(string);
            Calculator calculator=new Calculator();
            if (type.getValue().equals("Normal")){
                calculator.set_price_claculator(new NormalPriceCalcuator());
            }else if (type.getValue().equals("Premium")){
                calculator.set_price_claculator(new PremiumPriceCalcuator());
            }else if (type.getValue().equals("MotorBike")){
                calculator.set_price_claculator(new MotorBikePriceCalcuator());
            }else if (type.getValue().equals("Bus")){
                calculator.set_price_claculator(new BusPriceCalcuator());
            }
            string=Integer.toString(calculator.calcuate_price(distance));
            price.setText(string);
            From5 = FromLabel.getText();
            To5 = ToLabel.getText();
            type5 = (String) type.getValue();
            dist = distance2.getText();
        }
        catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.show();
            System.out.println(e.getMessage());
        }

    }
    public void PayOnAction(ActionEvent event){
        try {
            OpenPage(Pay,"Pay.fxml",800,500);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public TextField getToLabel() {
        return ToLabel;
    }

    public String[] getTypes() {
        return types;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        type.getItems().addAll(types);
    }


}
