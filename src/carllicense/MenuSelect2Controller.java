/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carllicense;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Predator
 */
public class MenuSelect2Controller implements Initializable {
    @FXML
    private Button btn_home;
    @FXML
    private Button btn_license;
    @FXML
    private Button btn_report;
    @FXML
    private Button btn_logout;
    @FXML
    private Button btn_logout1;
    @FXML
    private Button btn_logout11;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void exit(ActionEvent event) {
    }

    @FXML
    private void goToHome(ActionEvent event) {
    }

    @FXML
    private void goToSearchID(ActionEvent event) {
    }

    @FXML
    private void goToReport(ActionEvent event) {
    }
    
}
