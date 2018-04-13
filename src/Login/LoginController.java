package Login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController implements Initializable{

    Librarian l1=new Librarian();
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML 
    private Button login;
    @FXML
    private Label status;
    @FXML
    private Label connection; 
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
      //@Override
      public void initialize(URL location, ResourceBundle resources) {
          if(this.l1.isDatabaseConnected()){
              this.status.setText("Connected to Database");
          }
          else{
              this.status.setText("Not Connected");
          }
    }
    
}
