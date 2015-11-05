/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carllicense;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Student Lab
 */
public class ReportController implements Initializable {
    
    @FXML
    Button btn_home;
    @FXML
    private MenuButton kind;
    @FXML
    private MenuItem day;
    @FXML
    private MenuItem month;
    @FXML
    private MenuItem year;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    public void exit(){
        System.exit(0);
    }
    
    @FXML
    private void goToHome(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("menuSelect.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void logout(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void day(ActionEvent event) {
    }

    @FXML
    private void month(ActionEvent event) {
    }

    @FXML
    private void year(ActionEvent event) {
    }
}
