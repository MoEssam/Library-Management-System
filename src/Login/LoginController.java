package Login;

import Librarian.AdminController;
import Librarian.MembersController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class LoginController implements Initializable {
    Librarian l1=new Librarian();
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXButton Loginbutton;
    @FXML
    private JFXButton CancelButton;
    @FXML
    private JFXButton signupbtn;

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        

    }    
    @FXML
    private void LibrarianLogin(ActionEvent event) throws SQLException, IOException {
        
        if(l1.isLogin(username.getText(),password.getText())){
            
                Stage stage = (Stage) Loginbutton.getScene().getWindow();
                stage.close();
                adminLogin();
    }        
    }

    @FXML
    private void handleCancelBtnAction(ActionEvent event) {
        System.exit(1);
    }
     public void adminLogin() throws IOException
    {
     try{
         Stage adminstage = new Stage();
         FXMLLoader adminLoader = new FXMLLoader();
         Pane adminroot = (Pane)adminLoader.load(getClass().getResource("/Librarian/admin.fxml").openStream());
         AdminController adminController = (AdminController)adminLoader.getController();
         Scene scene =new Scene(adminroot);
         adminstage.setScene(scene);
         adminstage.setTitle("Admin Dashboard");
         adminstage.show();
         
     }
     catch (IOException e){
         e.printStackTrace();
     }   
}
   @FXML
    private void signup(ActionEvent event) throws IOException{
        Stage signupstage=new Stage();
        FXMLLoader signupLoader=new FXMLLoader();
        Pane signuproot = (Pane)signupLoader.load(getClass().getResource("Sign Up.fxml").openStream());
        SignUpController memberController=(SignUpController)signupLoader.getController();
        Scene scene=new Scene(signuproot);
        signupstage.setScene(scene);
        signupstage.setTitle("Sign Up");
        signupstage.show();
        
    }
}