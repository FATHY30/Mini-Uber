package com.example.miniuber.calculator;
public class NormalPriceCalcuator extends PriceCalcuator{
    @Override
    public int calcuate_price(DistanceCalcuator distance){
        if (distance.get_distance()>=1){
            return distance.get_distance()*8;
        }
        else{
            return 5;
        }
    }
    @Override
    public String calculator_name(){
        return "Normal Ride";
    }
}