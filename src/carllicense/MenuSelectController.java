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
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alizzabeth
 */
public class MenuSelectController implements Initializable {
    @FXML
    private MenuItem exit;
    @FXML
    private Button btn_license;
    @FXML
    private Button btn_report;
    @FXML
    private Button btn_logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void exit(){
        System.exit(0);
    }

    @FXML
    private void goToSearchID(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("searchID.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_license.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
            
    @FXML
    private void goToReport(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("report.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_report.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_logout.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
