package com.example.miniuber.calculator;
import java.util.Random;
public class CalculateXYCoordinate {
    private int fromX;
    private int toX;
    private int fromY;

    private int ToY;
    public static String From5;
    public static String To5;
    public  CalculateXYCoordinate()
    {
        Random random=new Random();
        fromX =random.nextInt()%40;
        fromY =random.nextInt()%40;
        ToY=random.nextInt()%40;
        toX =random.nextInt()%40;

    }

    public int getFromY() {
        return fromY;
    }

    public int getFromX() {
        return fromX;
    }

    public int getToX() {
        return toX;
    }

    public int getToY() {
        return ToY;
    }
}

