package com.example.miniuber.calculator;

public class PremiumPriceCalcuator extends PriceCalcuator{
    @Override
    public int calcuate_price(DistanceCalcuator distance){
        if (distance.get_distance()>=1){
            return distance.get_distance()*12;
        }
        else{
            return 10;
        }
    }
    @Override
    public String calculator_name(){
        return "Premium Ride";
    }
}