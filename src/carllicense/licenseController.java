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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
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
public class licenseController implements Initializable {

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
    private Button btn_pay;
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
    @FXML
    private Button btn_save;
    @FXML
    private DatePicker practical_date;
    @FXML
    private TextField nameTH;
    @FXML
    private TextField surnameTH;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField nation;
    @FXML
    private TextField tel;
    @FXML
    private Text alert;
    @FXML
    private Button btn_back;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO
    }

    @FXML
    public void exit() {
        System.exit(0);
    }

    @FXML
    private void searchId(ActionEvent event) {
        String id = search.getText();
        String b_id = "1101500764377";
        data_btn.setVisible(id.equals(b_id));
        data1.setVisible(id.equals(b_id));
        data2.setVisible(id.equals(b_id));
        if (!id.equals(b_id)) {
            result.setText("ไม่พบข้อมูล");
            btn_next.setDisable(true);
        } else {
            btn_next.setDisable(false);
        }
        result.setVisible(!id.equals(b_id) || id == null);
    }

    @FXML
    private void goToHistory(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("licenseProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToHistoryCon(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("licenseProfileCon.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToHistoryRenew(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("licenseProfileRenew.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
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
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToProfile(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("checkProfileShow.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_pre.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToProfileCon(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("checkProfileCom.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_pre.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToProfileRenew(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("checkProfileRenew.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_pre.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToLicense(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("saveProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_next.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToLicenseCon(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("saveProfileCon.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_next.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToLicenseRenew(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("saveProfileRenew.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_next.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToPayment(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("payment.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_pay.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToPaymentCon(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("paymentCon.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_pay.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void goToPaymentRenew(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("paymentRenew.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_pay.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToEdit(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("editProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void save(ActionEvent event) throws IOException {

        Parent page = FXMLLoader.load(getClass().getResource("checkProfileShow.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    private boolean checkTest() {
        String data[] = new String[5];
        data[0] = nameTH.getText();
        data[1] = surnameTH.getText();
        data[2] = name.getText();
        data[3] = surname.getText();
        data[4] = nation.getText();

        boolean re = true;
        int d = 0;
        while (d <= 4) {
            for (int i = 0; i < data[d].length(); i++) {
                char text = data[d].charAt(i);
                if (text >= '0' || text <= '9') {
                    return re = false;
                }
            }
            if (re == false) {
                return false;
            }
            d++;
        }
        return re;
    }

    private boolean checkPhone() {
        String phone = tel.getText();
        boolean re = true;
        for (int i = 0; i < phone.length(); i++) {
            char p = phone.charAt(i);
            if (!(p >= '0' && p <= '9') || p != '-') {
                return re = false;
            }
        }
        return re;
    }

    

   /*@FXML
    private boolean check(ActionEvent event) throws IOException {
        String trans_type = (String) transaction_type.getText();
        String li_type = (String) license_type.getText();
        if ((!trans_type.equals("กรุณาเลือก") && !li_type.equals("กรุณาเลือก")) && (practical_yes.isSelected() || practical_no.isSelected()) && (!practical_date.getValue().equals(null)) && (response_no.isSelected() || response_yes.isSelected())) {
            btn_save.setDisable(false);
            return true;
        } else {
            btn_save.setDisable(true);
            return false;
        }

    }*/

    @FXML
    private void li_car_time(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถยนต์ชั่วคราว");

    }

    @FXML
    private void li_trycycle_time(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถยนต์สามล้อชั่วคราว");
    }

    @FXML
    private void li_moter_time(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถจักรยานยนต์ส่วนบุคคลชั่วคราว");
    }

    @FXML
    private void li_car(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถยนต์ส่วนบุคคล");
    }

    @FXML
    private void li_trycycle(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถยนต์สามล้อส่วนบุคคล");
    }

    @FXML
    private void li_moter(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถจักรยานยนต์ส่วนบุคคล");
    }

    @FXML
    private void li_car_public(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถยนต์สาธารณะ");
    }

    @FXML
    private void li_trycycle_public(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถยนต์สามล้อสาธารณะ");
    }

    @FXML
    private void li_moter_public(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถจักรยานยนต์สาธารณะ");
    }

    @FXML
    private void li_road(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถบดถนน");
    }

    @FXML
    private void li_track(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถแทรกเตอร์");
    }

    @FXML
    private void li_other(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถชนิดอื่น");
    }

    @FXML
    private void li_foriegn(ActionEvent event) throws IOException {
        license_type.setText("ใบอนุญาติขับรถระหว่างประเทศ");
    }

    @FXML
    private void goToMenu2(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("menuSelect2.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToLicenseProfile(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("licenseProfile.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) btn_back.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
