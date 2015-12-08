/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carllicense;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
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
    @FXML
    private Label num_new;
    @FXML
    private Label num_con;
    @FXML
    private Label num_re;
    private MenuButton input_month;
    private MenuButton input_year;
    @FXML
    private Button btn_view_report;
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
        kind.setText("รายงานประจำวัน");
    }

    @FXML
    private void month(ActionEvent event) {
        kind.setText("รายงานประจำเดือน");
    }

    @FXML
    private void year(ActionEvent event) {
        kind.setText("รายงานประจำปี");
    }
    
    private int[] randomMonth(){
        int num[] = new int[3];
        num[0] = (int)(Math.random()*50);
        num[1] = (int)(Math.random()*50);
        num[2] = (int)(Math.random()*50);
        return num;
    }
    
    private int[] randomYear(){
        int num[] = new int[3];
        num[0] = (int)(Math.random()*100);
        num[1] = (int)(Math.random()*100);
        num[2] = (int)(Math.random()*100);
        return num;
    }

    @FXML
    private void viewReport(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("dailyReport.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
