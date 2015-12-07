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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alizzabeth
 */
public class loginController implements Initializable {

    @FXML
    private TextField user;
    @FXML
    private PasswordField pass;
    @FXML
    private Button btn_login;
    @FXML
    private Text result;
    @FXML
    private MenuItem exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        if (user.getText().equalsIgnoreCase("admin") && pass.getText().equalsIgnoreCase("password")) {
            Parent root = FXMLLoader.load(getClass().getResource("menuSelect.fxml"));
            Stage stage = (Stage) btn_login.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            result.setVisible(true);
        }
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }


}
