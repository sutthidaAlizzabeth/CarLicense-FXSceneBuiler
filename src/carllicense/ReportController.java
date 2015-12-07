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
    private DatePicker input_date;
    @FXML
    private Label num_new;
    @FXML
    private Label num_con;
    @FXML
    private Label num_re;
    @FXML
    private GridPane show_month_year;
    @FXML
    private MenuButton input_month;
    @FXML
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
        input_date.setVisible(true);
        show_month_year.setVisible(true);
        input_month.setVisible(false);
        input_year.setVisible(false);
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
    private void inputDate(ActionEvent event) {
        num_new.setText((int)(Math.random()*10)+"");
        num_con.setText((int)(Math.random()*10)+"");
        num_re.setText((int)(Math.random()*10)+"");
        
    }

    @FXML
    private void setJan(ActionEvent event) {
        input_month.setText("มกราคม");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setFeb(ActionEvent event) {
        input_month.setText("กุมภาพันธ์");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setMar(ActionEvent event) {
        input_month.setText("มีนาคม");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setApr(ActionEvent event) {
        input_month.setText("เมษายน");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setMay(ActionEvent event) {
        input_month.setText("พฤษภาคม");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setJun(ActionEvent event) {
        input_month.setText("มิถุนายน");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setJul(ActionEvent event) {
        input_month.setText("กรกฎาคม");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setAug(ActionEvent event) {
        input_month.setText("สิงหาคม");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setSep(ActionEvent event) {
        input_month.setText("กันยายน");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setOct(ActionEvent event) {
        input_month.setText("ตุลาคม");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setNov(ActionEvent event) {
        input_month.setText("พฤศจิกายน");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void setDec(ActionEvent event) {
        input_month.setText("ธันวาคม");
        int num[] = randomMonth();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
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
    private void set2000(ActionEvent event) {
        input_year.setText("2000");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2001(ActionEvent event) {
        input_year.setText("2001");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2002(ActionEvent event) {
        input_year.setText("2002");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2003(ActionEvent event) {
        input_year.setText("2003");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2004(ActionEvent event) {
        input_year.setText("2004");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2005(ActionEvent event) {
        input_year.setText("2005");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2006(ActionEvent event) {
        input_year.setText("2006");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2007(ActionEvent event) {
        input_year.setText("2007");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2008(ActionEvent event) {
        input_year.setText("2008");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2009(ActionEvent event) {
        input_year.setText("2009");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2010(ActionEvent event) {
        input_year.setText("2010");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2011(ActionEvent event) {
        input_year.setText("2011");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2012(ActionEvent event) {
        input_year.setText("2012");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2013(ActionEvent event) {
        input_year.setText("2013");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2014(ActionEvent event) {
        input_year.setText("2014");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
    }

    @FXML
    private void set2015(ActionEvent event) {
        input_year.setText("2015");
        int num[] = randomYear();
        num_new.setText(num[0]+"");
        num_con.setText(num[1]+"");
        num_re.setText(num[2]+"");
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
