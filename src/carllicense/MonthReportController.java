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
public class MonthReportController implements Initializable {
    @FXML
    private DatePicker input_date;
    @FXML
    private MenuButton kind;
    @FXML
    private GridPane show_month_year;
    @FXML
    private MenuButton input_month;
    @FXML
    private MenuButton input_year;
    @FXML
    private Button btn_view_stat;
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
    private void day(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("dailyReport.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.setScene(scene);
    }

    @FXML
    private void month(ActionEvent event) {
        kind.setText("รายงานประจำเดือน");
        input_date.setVisible(false);
        show_month_year.setVisible(true);
        input_month.setVisible(true);
        input_year.setVisible(true);
        input_month.setText("พฤศจิกายน");
        input_year.setText("2015");
    }

    @FXML
    private void year(ActionEvent event) {
        kind.setText("รายงานประจำปี");
        input_date.setVisible(false);
        show_month_year.setVisible(true);
        input_month.setVisible(false);
        input_year.setVisible(true);
        input_year.setText("2015");
    }

    @FXML
    private void setJan(ActionEvent event) {
        input_month.setText("มกราคม");
    }

    @FXML
    private void setFeb(ActionEvent event) {
        input_month.setText("กุมภาพันธ์");
    }

    @FXML
    private void setMar(ActionEvent event) {
        input_month.setText("มีนาคม");
    }

    @FXML
    private void setApr(ActionEvent event) {
        input_month.setText("เมษายน");
    }

    @FXML
    private void setMay(ActionEvent event) {
        input_month.setText("พฤษภาคม");
    }

    @FXML
    private void setJun(ActionEvent event) {
        input_month.setText("มิถุนายน");
    }

    @FXML
    private void setJul(ActionEvent event) {
        input_month.setText("กรกฎาคม");
    }

    @FXML
    private void setAug(ActionEvent event) {
        input_month.setText("สิงหาคม");
    }

    @FXML
    private void setSep(ActionEvent event) {
        input_month.setText("กันยายน");
    }

    @FXML
    private void setOct(ActionEvent event) {
        input_month.setText("ตุลาคม");
    }

    @FXML
    private void setNov(ActionEvent event) {
        input_month.setText("พฤศจิกายน");
    }

    @FXML
    private void setDec(ActionEvent event) {
        input_month.setText("ธันวาคม");
    }

    @FXML
    private void set2000(ActionEvent event) {
        input_year.setText("2000");
    }

    @FXML
    private void set2001(ActionEvent event) {
        input_year.setText("2001");
    }

    @FXML
    private void set2002(ActionEvent event) {
        input_year.setText("2002");
    }

    @FXML
    private void set2003(ActionEvent event) {
        input_year.setText("2003");
    }

    @FXML
    private void set2004(ActionEvent event) {
        input_year.setText("2004");
    }

    @FXML
    private void set2005(ActionEvent event) {
        input_year.setText("2005");
    }

    @FXML
    private void set2006(ActionEvent event) {
        input_year.setText("2006");
    }

    @FXML
    private void set2007(ActionEvent event) {
        input_year.setText("2007");
    }

    @FXML
    private void set2008(ActionEvent event) {
        input_year.setText("2008");
    }

    @FXML
    private void set2009(ActionEvent event) {
        input_year.setText("2009");
    }

    @FXML
    private void set2010(ActionEvent event) {
        input_year.setText("2010");
    }

    @FXML
    private void set2011(ActionEvent event) {
        input_year.setText("2011");
    }

    @FXML
    private void set2012(ActionEvent event) {
        input_year.setText("2012");
    }

    @FXML
    private void set2013(ActionEvent event) {
        input_year.setText("2013");
    }

    @FXML
    private void set2014(ActionEvent event) {
        input_year.setText("2014");
    }

    @FXML
    private void set2015(ActionEvent event) {
        input_year.setText("2015");
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
    private void goToHome(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("menuSelect.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
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
    
}
