package com.example.dasistes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.setId("pane");
        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}