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
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alizzabeth
 */
public class DailyReportController implements Initializable {
    @FXML
    private Button btn_home;
    @FXML
    private GridPane show_month_year;
    @FXML
    private MenuButton input_month;
    @FXML
    private MenuButton input_year;
    @FXML
    private Button btn_view_stat;
    @FXML
    private MenuButton kind;
    @FXML
    private DatePicker input_date;

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
    private void logout(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
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
    private void setJan(ActionEvent event) {
    }

    @FXML
    private void setFeb(ActionEvent event) {
    }

    @FXML
    private void setMar(ActionEvent event) {
    }

    @FXML
    private void setApr(ActionEvent event) {
    }

    @FXML
    private void setMay(ActionEvent event) {
    }

    @FXML
    private void setJun(ActionEvent event) {
    }

    @FXML
    private void setJul(ActionEvent event) {
    }

    @FXML
    private void setAug(ActionEvent event) {
    }

    @FXML
    private void setSep(ActionEvent event) {
    }

    @FXML
    private void setOct(ActionEvent event) {
    }

    @FXML
    private void setNov(ActionEvent event) {
    }

    @FXML
    private void setDec(ActionEvent event) {
    }

    @FXML
    private void set2000(ActionEvent event) {
    }

    @FXML
    private void set2001(ActionEvent event) {
    }

    @FXML
    private void set2002(ActionEvent event) {
    }

    @FXML
    private void set2003(ActionEvent event) {
    }

    @FXML
    private void set2004(ActionEvent event) {
    }

    @FXML
    private void set2005(ActionEvent event) {
    }

    @FXML
    private void set2006(ActionEvent event) {
    }

    @FXML
    private void set2007(ActionEvent event) {
    }

    @FXML
    private void set2008(ActionEvent event) {
    }

    @FXML
    private void set2009(ActionEvent event) {
    }

    @FXML
    private void set2010(ActionEvent event) {
    }

    @FXML
    private void set2011(ActionEvent event) {
    }

    @FXML
    private void set2012(ActionEvent event) {
    }

    @FXML
    private void set2013(ActionEvent event) {
    }

    @FXML
    private void set2014(ActionEvent event) {
    }

    @FXML
    private void set2015(ActionEvent event) {
    }

    @FXML
    private void viewStat(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("report.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void day(ActionEvent event) {
        kind.setText("รายงานประจำวัน");
        input_date.setVisible(true);
        show_month_year.setVisible(true);
        input_month.setVisible(false);
        input_year.setVisible(false);
    }

    @FXML
    private void month(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("monthReport.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void year(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("yearReport.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
