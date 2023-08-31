package com.example.miniuber.calculator;

public class MotorBikePriceCalcuator extends PriceCalcuator{
    @Override
    public int calcuate_price(DistanceCalcuator distance){
        if (distance.get_distance()>=1){
            return distance.get_distance()*4;
        }
        else{
            return 2;
        }
    }
    @Override
    public String calculator_name(){
        return "Motor bike Ride";
    }
}