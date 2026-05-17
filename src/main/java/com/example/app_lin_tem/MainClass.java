package com.example.app_lin_tem;

import com.example.app_lin_tem.Controllers.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class MainClass extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Image iconImage = new Image(new FileInputStream("src/main/resources/Iconos/reloj.png"));
        FXMLLoader fxmlLoader = new FXMLLoader(MainClass.class.getResource("Main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("TimeAfterTime");
        stage.getIcons().add(iconImage);
        stage.setResizable(true);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
        MainViewController ctr = fxmlLoader.getController();
        ctr.postInit();
    }
}