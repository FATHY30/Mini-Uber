package com.example.miniuber.calculator;
public class BusPriceCalcuator extends PriceCalcuator{
    @Override
    public int calcuate_price(DistanceCalcuator distance){
        return 10;
    }
    @Override
    public String calculator_name(){
        return "Bus Ride";
    }
}