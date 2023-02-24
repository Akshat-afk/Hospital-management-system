package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrimaryController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    
    @FXML
    private void switchToPLogin(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("plogin.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    private void switchToDLogin(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("dlogin.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    private void switchToALogin(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("alogin.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    private TextField Username;
    @FXML
    private TextField Password;
    String username,password;
    public void login(ActionEvent event){
        //check this data for the server
        password = Password.getText();
        username = Username.getText();
    }
}
