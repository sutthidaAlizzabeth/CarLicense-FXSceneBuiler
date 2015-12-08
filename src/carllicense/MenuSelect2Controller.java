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
public class MenuSelect2Controller implements Initializable {
    @FXML
    private Button btn_home;
    @FXML
    private Button btn_license;
    @FXML
    private Button btn_renew;
    @FXML
    private Button btn_redo;
    @FXML
    private Button btn_edit;
    @FXML
    private Button btn_back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(ActionEvent event) throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void exit(ActionEvent event) throws IOException{
        System.exit(0);
    }

    @FXML
    private void goToHome(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("menuSelect.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToSearchID(ActionEvent event) throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("searchID.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToLicense(ActionEvent event) throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("checkProfileShow.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToRenew(ActionEvent event) throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("checkProfileRenew.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToEdit(ActionEvent event) throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("editProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToRedo(ActionEvent event) throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("checkProfileCom.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
