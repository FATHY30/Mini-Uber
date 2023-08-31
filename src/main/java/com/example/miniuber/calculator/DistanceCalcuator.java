package com.example.miniuber.calculator;
public class DistanceCalcuator{
    private int distance=0;
    public int normal_ride(double x1,double y1,double x2,double y2){
        double x,y;
        y=y2-y1;
        x=x2-x1;
        distance=(int)Math.sqrt(((x*x)+(y*y)));
        return distance;
    }
    public int get_distance(){
        return distance;
    }
}
