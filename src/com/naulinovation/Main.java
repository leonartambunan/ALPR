package com.naulinovation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResource("alpr.fxml").openStream());
        Controller controller =  fxmlLoader.getController();

        primaryStage.setTitle("ALPR v1.1 - PTNIO");
        primaryStage.setScene(new Scene(root, 800, 600));

        primaryStage.show();

    }


    public static void main(String[] args) {


        launch(args);
    }


}

