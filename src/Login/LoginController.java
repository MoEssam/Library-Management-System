package Login;

import Librarian.AdminController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class LoginController implements Initializable{

    Librarian l1=new Librarian();
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML 
    private Button loginButton;
    @FXML
    private Label status;
    @FXML
    
    private Label loginStatus; 

    
    
    @FXML
    public void LibrarianLogin(ActionEvent event){
        try{
            
            if(l1.isLogin(username.getText(),password.getText())){
            
                Stage stage = (Stage) this.loginButton.getScene().getWindow();
                stage.close();
                adminLogin();
            }
            else{
                loginStatus.setText("Invalid");
            }
        }
        catch(Exception locaException){
            locaException.printStackTrace();
        }
            
        } 
    public void adminLogin()
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
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(this.l1.isDatabaseConnected()){
            this.status.setText("Connected to Database");
        }
        else{
            this.status.setText("Not Connected");
        }
    }
    
    
}