package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class LogingDashboardController {

    @FXML
    private AnchorPane loginDashboard;


    @FXML
    void btnAdminOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/AdminSignInPage.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) loginDashboard.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("AdminSignInForm");
        stage.centerOnScreen();

    }

    @FXML
    void btnUserOnAction(ActionEvent event) throws IOException {  AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/user/UserSignIn.fxml"));
        Scene scene = new Scene(anchorPane);
        Stage stage = (Stage) loginDashboard.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("UserSignInForm");
        stage.centerOnScreen();
    }

}
