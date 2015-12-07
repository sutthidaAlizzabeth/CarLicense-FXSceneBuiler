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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Predator
 */
public class LicenseProfileController implements Initializable {

    @FXML
    private Button btn_home;
    @FXML
    private TextField search;
    @FXML
    private Button btn_search;
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
    @FXML
    private GridPane data_1;
    @FXML
    private GridPane data_2;
    @FXML
    private Text result;
    @FXML
    private Button btn_pre;

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
        Stage stage = (Stage) btn_pre.getScene().getWindow();
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
    private void searchId(ActionEvent event) {
        String id = search.getText();
        String b_id = "1101500764377";
        data_1.setVisible(id.equals(b_id));
        data_2.setVisible(id.equals(b_id));
        result.setVisible(!id.equals(b_id));
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
