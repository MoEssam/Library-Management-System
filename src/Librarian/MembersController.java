/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarian;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class MembersController implements Initializable {

    @FXML
    private JFXTextField firstname;
    @FXML
    private JFXTextField middlename;
    @FXML
    private JFXTextField lastname;
    @FXML
    private JFXTextField dateofbirth;
    @FXML
    private JFXTextField dateofmemberShip;
    @FXML
    private JFXTextField address;
    @FXML
    private JFXTextField contactnumber;
    @FXML
    private JFXTextField emailaddress;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TO
    }    
    
}
