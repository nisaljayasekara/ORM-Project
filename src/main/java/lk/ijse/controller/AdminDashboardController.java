package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardController {

    @FXML
    private AnchorPane root;
    @FXML
    void btnBooksOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane;
        anchorPane = FXMLLoader.<AnchorPane>load(getClass().getResource("/view/admin/AdminBooksPage.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(anchorPane);
    }

    @FXML
    void btnBranchesOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane;
        anchorPane = FXMLLoader.<AnchorPane>load(getClass().getResource("/view/admin/BranchesPage.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(anchorPane);
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane;
        anchorPane = FXMLLoader.<AnchorPane>load(getClass().getResource("/view/AdminBooks.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(anchorPane);
    }

    @FXML
    void btnLogOutOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/AdminSignInPage.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Admin SignIn");
        stage.show();

        Stage dashboard= (Stage) root.getScene().getWindow();
        dashboard.close();
    }

    @FXML
    void btnRecordsOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane;
        anchorPane = FXMLLoader.<AnchorPane>load(getClass().getResource("/view/admin/AdminRecords.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(anchorPane);
    }

    @FXML
    void btnUsersOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane;
        anchorPane = FXMLLoader.<AnchorPane>load(getClass().getResource("/view/admin/AdminUsersPage.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(anchorPane);
    }

}
