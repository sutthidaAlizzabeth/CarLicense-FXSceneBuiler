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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
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
    @FXML
    private MenuButton transaction_type;
    @FXML
    private MenuButton license_type;
    @FXML
    private RadioButton practical_yes;
    @FXML
    private RadioButton practical_no;
    @FXML
    private GridPane practical_no_result;
    @FXML
    private RadioButton response_yes;
    @FXML
    private RadioButton response_no;

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
    private void practicalYes(ActionEvent event) throws IOException {
        practical_no.setSelected(false);
        practical_no_result.setVisible(false);
        
    }
    
    @FXML
    private void practicalNo(ActionEvent event) throws IOException {
        practical_yes.setSelected(false);
        practical_no_result.setVisible(true);
        
    }
    
    @FXML
    private void responseYes(ActionEvent event) throws IOException {
        response_no.setSelected(false);
        
    }
    
    @FXML
    private void responseNo(ActionEvent event) throws IOException {
        response_yes.setSelected(false);
        
    }
    
    @FXML
    private void new_card(ActionEvent event) {
        transaction_type.setText("ทำบัตรใหม่");
    }

    @FXML
    private void re_card(ActionEvent event) {
        transaction_type.setText("ทำบัตรทดแทน");
    }

    @FXML
    private void continue_card(ActionEvent event) {
        transaction_type.setText("ต่ออายุบัตร");
    }
    
    @FXML
    private void li_car_time(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถยนต์ชั่วคราว");
 
    }

    @FXML
    private void li_trycycle_time(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถยนต์สามล้อชั่วคราว");
    }

    @FXML
    private void li_moter_time(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถจักรยานยนต์ส่วนบุคคลชั่วคราว");
    }

    @FXML
    private void li_car(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถยนต์ส่วนบุคคล");
    }

    @FXML
    private void li_trycycle(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถยนต์สามล้อส่วนบุคคล");
    }

    @FXML
    private void li_moter(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถจักรยานยนต์ส่วนบุคคล");
    }

    @FXML
    private void li_car_public(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถยนต์สาธารณะ");
    }

    @FXML
    private void li_trycycle_public(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถยนต์สามล้อสาธารณะ");
    }

    @FXML
    private void li_moter_public(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถจักรยานยนต์สาธารณะ");
    }

    @FXML
    private void li_road(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถบดถนน");
    }

    @FXML
    private void li_track(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถแทรกเตอร์");
    }

    @FXML
    private void li_other(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถชนิดอื่น");
    }

    @FXML
    private void li_foriegn(ActionEvent event) {
        license_type.setText("ใบอนุญาติขับรถระหว่างประเทศ");
    }
 
}
