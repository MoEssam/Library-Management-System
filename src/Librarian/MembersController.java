/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarian;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class MembersController implements Initializable {
    MembersData m1=new MembersData();
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
    @FXML
    private JFXButton save;
    @FXML
    private JFXButton cancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TO
    }    

    @FXML
    private void handleSaveBtnAction(ActionEvent event) {
        m1.add_member(firstname.getText(), middlename.getText(), lastname.getText(), dateofbirth.getText(), dateofmemberShip.getText(), address.getText(), contactnumber.getText(), emailaddress.getText());
    }

    @FXML
    private void handleCancelBtnAction(ActionEvent event) {
        
    }
    
}
