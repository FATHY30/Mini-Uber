package com.example.miniuber.calculator;
public class Calculator {
    private PriceCalcuator priceCalcuator;
    public static int price2 = 0;
    public static String type5 = null;
    public void set_price_claculator(PriceCalcuator a){
        this.priceCalcuator=a;
    }
    public int calcuate_price(DistanceCalcuator distance){
        price2  = priceCalcuator.calcuate_price(distance);
        return price2;
    }


}
