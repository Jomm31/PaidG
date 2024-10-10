package com.example.paidg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class GamesBoughtController {

    @FXML
    private Button GamesBought;

    @FXML
    public void initialize() {
        GamesBought.setOnAction(event -> goBack());
    }

    private void goBack() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("games.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) GamesBought.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
