/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carllicense;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author mazzrider
 */
public class CheckProfileController implements Initializable {
    @FXML
    private TextField search;
    @FXML
    private Button btn_search;
    @FXML
    private Rectangle data_bg1;
    @FXML
    private Rectangle data_bg2;
    @FXML
    private Button data_btn;
    @FXML
    private GridPane data1;
    @FXML
    private GridPane data2;
    @FXML
    private GridPane data3;
    @FXML
    private Rectangle data_bg3;
    @FXML
    private Button btn_license;
    @FXML
    private Button btn_history;
    @FXML
    private Button btn_home;
    @FXML
    private Button btn_next;
    @FXML
    private Text result;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void searchId(ActionEvent event) {
        String id = search.getText();
        String b_id = "1101500764377";
        data_btn.setVisible(id.equals(b_id));
        data_bg1.setVisible(id.equals(b_id));
        data_bg2.setVisible(id.equals(b_id));
        data_bg3.setVisible(id.equals(b_id));
        data1.setVisible(id.equals(b_id));
        data2.setVisible(id.equals(b_id));
        data3.setVisible(id.equals(b_id));
        result.setVisible(!id.equals(b_id) || id == null);
    }

    @FXML
    private void goToLicense(ActionEvent event) {
    }

    @FXML
    private void goToHistory(ActionEvent event) {
    }
    
}
