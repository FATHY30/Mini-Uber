package com.example.miniuber.Connection;
import javafx.scene.control.Alert;
import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:mini.sqlite");
        }catch (Exception e){
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR,"Database Error");
            alert.show();
            return null;
        }
    }
}