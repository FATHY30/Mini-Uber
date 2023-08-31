package com.example.miniuber.calculator;
abstract class PriceCalcuator{
    abstract public int calcuate_price(DistanceCalcuator distance);
    abstract public String calculator_name();
}