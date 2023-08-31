package com.example.miniuber.Controller;

import com.example.miniuber.calculator.CalculateXYCoordinate;
import com.example.miniuber.calculator.DistanceCalcuator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RequestDriverController {
    @FXML
    private Label distance2; 
    public void submit(ActionEvent event) {

        try {
            CalculateXYCoordinate coordinate=new CalculateXYCoordinate();
            DistanceCalcuator distance=new DistanceCalcuator();
            distance.normal_ride(coordinate.getFromX(), coordinate.getFromY(), coordinate.getToX(), coordinate.getToY());
            String string=Integer .toString(distance.get_distance());
            distance2.setText(string);
            System.out.println(distance.get_distance());
        }
        catch (Exception e) {
            
        }
    }
}
