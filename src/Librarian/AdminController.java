package Librarian;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Mohamed Essam
 */
public class AdminController implements Initializable {

    @FXML
    private Tab bookissue;
    @FXML
    private JFXTextField enterbookid;
    @FXML
    private Text bookname;
    @FXML
    private Text author;
    @FXML
    private JFXTextField entermemberid;
    @FXML
    private Text membername;
    @FXML
    private Text contact;
    @FXML
    private JFXButton issue;
    @FXML
    private Tab renew;
    @FXML
    private JFXTextField bookId;
    @FXML
    private JFXButton submission;
    @FXML
    private JFXButton addmember;
    @FXML
    private JFXButton addbook;
    @FXML
    private JFXButton viewmembers;
    @FXML
    private JFXButton viewbooks;
    @FXML
    private JFXButton settings;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleIssueBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleRenewBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleSubmissionBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleAddMemBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleAddBookBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleViewMemBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleViewBooksBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleSettingsBtnAction(ActionEvent event) {
    }
    
}
