package com.example.miniuber;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Mini Uber :)");
        stage.getIcons().add(new Image("C:\\Users\\dell\\IdeaProjects\\Mini-Uber\\src\\main\\resources\\com\\example\\miniuber\\Images\\916bebf0e5ef862246781f2859983d28.jpg"));
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}