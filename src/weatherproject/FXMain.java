/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package weatherproject;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author User
 */
public class FXMain extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.initStyle(StageStyle.DECORATED.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSONDataCollection.getData("http://api.openweathermap.org/data/2.5/weather?q=Dhaka,bd&APPID=85e2bf12407292d2571cae8391915d14");
        launch(args);
        
    }

}
