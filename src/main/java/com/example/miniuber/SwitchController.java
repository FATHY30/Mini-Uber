package com.example.miniuber;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchController {
    public static void SwitchTo(ActionEvent event,String FileName) throws IOException {
        Parent root = FXMLLoader.load(SwitchController.class.getResource(FileName));
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Mini Uber :)");
        stage.getIcons().add(new Image("D:\\College's projects\\Mini-Uber\\src\\main\\resources\\com\\example\\miniuber\\Images\\916bebf0e5ef862246781f2859983d28.jpg"));
        stage.show();
    }
    public static void OpenPage(Button event, String FileName,float width,float height) throws IOException {
        Stage stage1 = (Stage) event.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(FileName));
        Stage stage = new Stage();
        Scene scene = new Scene(fxmlLoader.load(), width, height);
        stage.setScene(scene);
        stage.setTitle("Mini Uber :)");
        stage.getIcons().add(new Image("D:\\College's projects\\Mini-Uber\\src\\main\\resources\\com\\example\\miniuber\\Images\\916bebf0e5ef862246781f2859983d28.jpg"));
        stage.show();
    }

}
