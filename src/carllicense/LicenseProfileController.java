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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Predator
 */
public class LicenseProfileController implements Initializable {
    @FXML
    private Button btn_profile;
    @FXML
    private Button btn_home;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToProfile(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("checkProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_profile.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToHome(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("menuSelect.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_profile.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
