package com.example.paidg;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button signInButton;


    @FXML
    protected void onSignUpButtonClick() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Register.fxml")); // Adjust the path if needed
            Pane registerPane = fxmlLoader.load();
            Stage stage = (Stage) signInButton.getScene().getWindow(); // Get the current stage from the button
            Scene scene = new Scene(registerPane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }


}
