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

/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class FacultymemberController implements Initializable {

    @FXML
    private JFXTextField employeeID;
    @FXML
    private JFXButton collegeName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveButton(ActionEvent event) {
    }

    @FXML
    private void cancelButton(ActionEvent event) {
    }
    
}
