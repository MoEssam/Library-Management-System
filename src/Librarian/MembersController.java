package Librarian;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;


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
    @FXML
    private JFXTextField id;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random();
    }    

    @FXML
    private void handleSaveBtnAction(ActionEvent event) {
        if(validateEmail()){
            m1.add_member(firstname.getText(), middlename.getText(), lastname.getText(), dateofbirth.getText(), dateofmemberShip.getText(), address.getText(), contactnumber.getText(), emailaddress.getText(),id.getText());
        }
    }

    @FXML
    private void handleCancelBtnAction(ActionEvent event) {
        
    }
    public void Random(){
        Random rd=new Random();
        id.setText(""+rd.nextInt(1000+1));
    }
    private boolean validateEmail(){
        Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher(emailaddress.getText());
        if(m.find()&&m.group().equals(emailaddress.getText())){
            return true;
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Email address");
            alert.setHeaderText(null);
            alert.setContentText("Please");
            alert.showAndWait();
            return false;
        }
    }
}
