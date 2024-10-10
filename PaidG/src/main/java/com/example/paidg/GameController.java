package com.example.paidg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class GameController {

    @FXML
    private Button GamesBought;

    @FXML
    private Button Logout;

    @FXML
    private Button buyGodOfWar;

    @FXML
    private Button buyGTAV;

    @FXML
    private Button buyStickman;

    @FXML
    private Button buyMinecraft;

    @FXML
    private Button buyRiseOfKingdoms;

    @FXML
    private Button buyTheSleepingGirl;

    @FXML
    public void initialize() {
        GamesBought.setOnAction(event -> openGamesBought());
        // Initialize buttons and set actions
        Logout.setOnAction(event -> handleLogout());

        // Add actions for buy buttons as needed
        buyGodOfWar.setOnAction(event -> System.out.println("God of War button clicked!"));
        // Repeat for other buttons...
    }



    private void openGamesBought() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gamesbought.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) GamesBought.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleLogout() {
        try {
            // Load the AccPage.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AccPage.fxml"));
            Scene scene = new Scene(loader.load());

            // Get the current stage and set the new scene
            Stage stage = (Stage) Logout.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Account Page");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
