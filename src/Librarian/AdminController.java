package Librarian;

import Book.AddBookController;
import Book.IssuablebookController;
import Book.ViewBookController;


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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class AdminController implements Initializable {


    @FXML
    private JFXTextField enterbookid;
    @FXML
    private JFXTextField entermemberid;
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
    //@FXML
    //private Tab bookissue;
    @FXML
    private Label namebook;
    @FXML
    private Label authorname;
    @FXML
    private Label member_name;
    @FXML
    private Label contactnumber;
    @FXML
    private ImageView add_book_img;
    @FXML
    private ImageView view_mem_img;
    @FXML
    private ImageView catalogue_img;
    @FXML
    private ImageView issue_img;
    @FXML
    private ImageView add_member_img;
    @FXML
    private JFXButton renewbtn;




    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    


    @FXML
    private void handleRenewBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleSubmissionBtnAction(ActionEvent event) {
    }

    @FXML
    private void updatemember(ActionEvent event) throws IOException {
            Stage MemStage=new Stage();
            FXMLLoader updatememberLoader=new FXMLLoader();
            Pane updatememberroot = (Pane)updatememberLoader.load(getClass().getResource("updatemember.fxml").openStream());
            UpdatememberController updatememberController=(UpdatememberController)updatememberLoader.getController();
            Scene scene=new Scene(updatememberroot);
            MemStage.setScene(scene);
            MemStage.setTitle("Choose one Option only");
            MemStage.show();
         
     
    }/*
   public void differentMemsLogin()throws IOException
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
    private void handleViewMemBtnAction(ActionEvent event) throws IOException {
         Stage viewmembersstage= new Stage();
        FXMLLoader viewmemberssLoader = new FXMLLoader();
         Pane viewmember = (Pane)viewmemberssLoader.load(getClass().getResource("ViewMembers.fxml").openStream());
         ViewMembersController add = (ViewMembersController)viewmemberssLoader.getController();
         Scene scene =new Scene(viewmember);
         viewmembersstage.setScene(scene);
         viewmembersstage.setTitle("View Members");
         viewmembersstage.show();
         
         
         
    }

    @FXML
    private void handleViewBooksBtnAction(ActionEvent event) throws IOException {
        Stage viewbooksstage= new Stage();
        FXMLLoader viewbooksLoader = new FXMLLoader();
         Pane viewbookroot = (Pane)viewbooksLoader.load(getClass().getResource("/Book/ViewBook.fxml").openStream());
          ViewBookController add = ( ViewBookController)viewbooksLoader.getController();
         Scene scene =new Scene(viewbookroot);
         viewbooksstage.setScene(scene);
         viewbooksstage.setTitle("View Book");
         viewbooksstage.show();
       
    }

    @FXML
    private void handleSettingsBtnAction(ActionEvent event) throws IOException {
         Stage Issuablebooksstage= new Stage();
        FXMLLoader IssuablebooksLoader = new FXMLLoader();
         Pane Issuablebooksroot = (Pane)IssuablebooksLoader.load(getClass().getResource("/Book/issuablebook.fxml").openStream());
          IssuablebookController add = ( IssuablebookController)IssuablebooksLoader.getController();
         Scene scene =new Scene(Issuablebooksroot);
         Issuablebooksstage.setScene(scene);
         Issuablebooksstage.setTitle("Issuable Books");
         Issuablebooksstage.show();
    }


    
}
