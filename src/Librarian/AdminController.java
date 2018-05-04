package Librarian;

import Book.AddBookController;


import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AdminController implements Initializable {


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



    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
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
    private void handleAddMemBtnAction(ActionEvent event) throws IOException {
        Stage MemStage=new Stage();
            FXMLLoader memberLoader=new FXMLLoader();
            Pane memberroot = (Pane)memberLoader.load(getClass().getResource("members.fxml").openStream());
           MembersController memberController=(MembersController)memberLoader.getController();
            Scene scene=new Scene(memberroot);
            MemStage.setScene(scene);
            MemStage.setTitle("Choose one Option only");
            MemStage.show();
         /*Stage stage = (Stage) addmember.getScene().getWindow();
                stage.close();
                differentMemsLogin();
         */
     
    }
  /* public void differentMemsLogin()throws IOException
    {
        try{
            Stage MemStage=new Stage();
            FXMLLoader memberLoader=new FXMLLoader();
            Pane memberroot = (Pane)memberLoader.load(getClass().getResource("/Librarian.choose/chooseTypeMember.fxml").openStream());
            ChooseTypeMemberController memberController=(ChooseTypeMemberController)memberLoader.getController();
            Scene scene=new Scene(memberroot);
            MemStage.setScene(scene);
            MemStage.setTitle("Choose one Option only");
            MemStage.show();
            
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
            
            
    }
*/
    @FXML
    private void handleAddBookBtnAction(ActionEvent event) throws IOException {
         Stage addbookstage = new Stage();
         FXMLLoader addbookLoader = new FXMLLoader();
         Pane bookroot = (Pane)addbookLoader.load(getClass().getResource("/Book/AddBook.fxml").openStream());
         AddBookController add = (AddBookController)addbookLoader.getController();
         Scene scene =new Scene(bookroot);
         addbookstage.setScene(scene);
         addbookstage.setTitle("Add Book");
         addbookstage.show();
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
