package com.example.miniuber.calculator;
import java.util.Random;
public class CalculateXYCoordinate {
    private int FromX;
    private int ToX;
    private int FromY;

    private int ToY;

    public  CalculateXYCoordinate()
    {
        Random random=new Random();
        FromX=random.nextInt()%40;
        FromY=random.nextInt()%40;
        ToY=random.nextInt()%40;
        ToX=random.nextInt()%40;

    }

    public int getFromY() {
        return FromY;
    }

    public int getFromX() {
        return FromX;
    }

    public int getToX() {
        return ToX;
    }

    public int getToY() {
        return ToY;
    }
}

