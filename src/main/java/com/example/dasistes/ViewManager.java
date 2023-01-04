package com.example.dasistes;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewManager {
    private Stage primaryStage = new Stage();
    private AnchorPane root;

    public ViewManager() {
    }


    public void initalizeMainMenu() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("style.css"));
            root = loader.load();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
