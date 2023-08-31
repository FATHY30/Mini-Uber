package com.example.miniuber.calculator;
public class Calculator {
    private PriceCalcuator priceCalcuator;
    public void set_price_claculator(PriceCalcuator a){
        this.priceCalcuator=a;
    }
    public int calcuate_price(DistanceCalcuator distance){
        return priceCalcuator.calcuate_price(distance);
    }
}
