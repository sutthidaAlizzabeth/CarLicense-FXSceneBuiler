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
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Predator
 */
public class CheckProfileComController implements Initializable {

    @FXML
    Button btn_back;
    @FXML
    private GridPane data2;
    @FXML
    private Text result;
    @FXML
    private GridPane data1;
    @FXML
    private Button btn_next;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void exit(){
        System.exit(0);
    }
    
    @FXML
    private void logout(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToMenu2(ActionEvent event) throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("menuSelect2.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToLicenseProfile(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("licenseProfileCon.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_next.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
