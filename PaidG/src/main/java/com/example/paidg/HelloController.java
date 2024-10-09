package com.example.paidg;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button signInButton; // Assuming this is your sign up button

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onSignUpButtonClick() {
        try {
            // Load the registration FXML
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Register.fxml")); // Adjust the path if needed
            Pane registerPane = fxmlLoader.load();

            // Create a new stage or use the existing one
            Stage stage = (Stage) signInButton.getScene().getWindow(); // Get the current stage from the button
            Scene scene = new Scene(registerPane);
            stage.setScene(scene); // Set the new scene
            stage.show(); // Show the updated stage
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
}
