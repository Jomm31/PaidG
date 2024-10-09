package com.example.paidg;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private RadioButton femaleRadio;

    @FXML
    private RadioButton maleRadio;

    @FXML
    private RadioButton othersRadio;

    @FXML
    private DatePicker birthdayPicker;

    @FXML
    private Button signUpButton;

    @FXML
    protected void onSignUpButtonClick() {
        // Validate fields
        if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() ||
                emailField.getText().isEmpty() || passwordField.getText().isEmpty()) {
            showAlert("Error", "All fields must be filled out.");
            return;
        }

        // Perform sign-up logic here (e.g., save to database)

        // If sign-up is successful, go back to the sign-in page
        goBackToSignIn();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void goBackToSignIn() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AccPage.fxml")); // Adjust path as needed
            AnchorPane signInPane = fxmlLoader.load();

            Stage stage = (Stage) signUpButton.getScene().getWindow(); // Get the current stage
            Scene scene = new Scene(signInPane);
            stage.setScene(scene); // Set the new scene
            stage.show(); // Show the updated stage
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
}

