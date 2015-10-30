/*
 * To change this licenseController header, choose License Headers in Project Properties.
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alizzabeth
 */
public class licenseController implements Initializable{
    
    @FXML
    private TextField search;
    @FXML
    private Button btn_search;
    @FXML
    private Button data_btn;
    @FXML
    private GridPane data1;
    @FXML
    private GridPane data2;
    @FXML
    private GridPane data_1;
    @FXML
    private GridPane data_2;
    @FXML
    private Button btn_home;
    @FXML
    private Button btn_next;
    @FXML
    private Text result;
    @FXML
    private Button btn_pre;
    @FXML
    private MenuItem li_car_time;
    @FXML
    private MenuItem li_trycycle_time;
    @FXML
    private MenuItem li_moter_time;
    @FXML
    private MenuItem li_car;
    @FXML
    private MenuItem li_trycycle;
    @FXML
    private MenuItem li_moter;
    @FXML
    private MenuItem li_car_public;
    @FXML
    private MenuItem li_trycycle_public;
    @FXML
    private MenuItem li_moter_public;
    @FXML
    private MenuItem li_road;
    @FXML
    private MenuItem li_track;
    @FXML
    private MenuItem li_other;
    @FXML
    private MenuItem li_foriegn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO
    }
    
    @FXML
    private void searchId(ActionEvent event) {
        String id = search.getText();
        String b_id = "1101500764377";
        data_btn.setVisible(id.equals(b_id));
        data1.setVisible(id.equals(b_id));
        data2.setVisible(id.equals(b_id));
        if(!id.equals(b_id)){
            result.setText("ไม่พบข้อมูล");
        }
        result.setVisible(!id.equals(b_id) || id == null);
    }
    
    @FXML
    private void goToHistory(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("licenseProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_next.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
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
    private void goToProfile(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("checkProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_pre.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToLicense(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("saveProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_pre.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void li_car_time(ActionEvent event) {
 
    }

    @FXML
    private void li_trycycle_time(ActionEvent event) {

    }

    @FXML
    private void li_moter_time(ActionEvent event) {
        
    }

    @FXML
    private void li_car(ActionEvent event) {
       
    }

    @FXML
    private void li_trycycle(ActionEvent event) {
      
    }

    @FXML
    private void li_moter(ActionEvent event) {
    
    }

    @FXML
    private void li_car_public(ActionEvent event) {
        
    }

    @FXML
    private void li_trycycle_public(ActionEvent event) {
        
    }

    @FXML
    private void li_moter_public(ActionEvent event) {
        
    }

    @FXML
    private void li_road(ActionEvent event) {
        
    }

    @FXML
    private void li_track(ActionEvent event) {
        
    }

    @FXML
    private void li_other(ActionEvent event) {
       
    }

    @FXML
    private void li_foriegn(ActionEvent event) {
        
    }
 
}
