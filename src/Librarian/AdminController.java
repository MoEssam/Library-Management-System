package Librarian;

import Book.AddBookController;
import Book.IssuablebookController;
import Book.ViewBookController;
import Database.dbConnection;
import Login.ForgetPasswordController;
import Book.IssuableBook;


import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class AdminController implements Initializable {

    Connection conn;
    ResultSet rs;
    PreparedStatement pr;
    @FXML
    private JFXTextField enterbookid;
    @FXML
    private JFXTextField entermemberid;
    @FXML
    private JFXTextField bookId;
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
    @FXML
    private Label namebook;
    @FXML
    private Label authorname;
    @FXML
    private Label member_name;
    @FXML
    private Label contactnumber;
    
    
    IssuableBook i1=new IssuableBook();
    @FXML
    private Label dateadded;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl6;
    @FXML
    private Label lbl7;
    @FXML
    private Label lbl8;
    @FXML
    private Label lbl9;
    @FXML
    private Label lbl10;
    





    @Override
    public void initialize(URL url, ResourceBundle rb) {
      try {
            conn=dbConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ForgetPasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    


    private void handleRenewBtnAction(ActionEvent event) throws SQLException {
        String id= enterbookid.getText();
        String sql = "SELECT * FROM issue WHERE BookTitle = '"+id+"'";
         pr=conn.prepareStatement(sql);
         while(rs.next()){
             String bookid= id;
             String memberid= rs.getString("HolderName");
             
         }
        
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
         
     
    }

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
    
    
    
    
    
    @FXML
    public void searchbook() throws SQLException
    {
        String get_id=enterbookid.getText();
        String sql="SELECT * FROM book where id = '"+get_id+"'"  ;       
        pr=conn.prepareStatement(sql);
        rs=pr.executeQuery();
        if(rs.next()){
            namebook.setText(rs.getString("title"));
            authorname.setText(rs.getString("author"));
            dateadded.setText(rs.getString("DateAdded"));
            rs.close();
            pr.close();
        }
    }
    public void searchmember() throws SQLException
    {
        String get_id=entermemberid.getText();
        String sql="SELECT * FROM members where id = '"+get_id+"'"  ;
        pr=conn.prepareStatement(sql);
        rs=pr.executeQuery();
        if(rs.next()){
            member_name.setText(rs.getString("firstname"));
            contactnumber.setText(rs.getString("contactnumber"));
            rs.close();
            pr.close();
        }
    } 
    public void update() throws SQLException
    {
        String get_id=enterbookid.getText();
        String sql="UPDATE book set NumberofCopies = NumberofCopies -1 where id= '"+get_id+"'";
        pr=conn.prepareStatement(sql);
        
    } 
    public void searchbook(ActionEvent event) throws SQLException {
        searchbook();
        searchmember();
        i1.issue(namebook.getText(), member_name.getText(), entermemberid.getText(),enterbookid.getText(),dateadded.getText(),authorname.getText());
        //update();
    }

    @FXML
    private void returnbook(ActionEvent event) throws SQLException {
        
        String get_id=bookId.getText();
        String sql="SELECT * FROM issue where memberid = '"+get_id+"'"  ;
        pr=conn.prepareStatement(sql);
        rs=pr.executeQuery();
         if(rs.next()){
            lbl1.setText(rs.getString("HolderName"));
            lbl2.setText(rs.getString("memberid"));
            lbl3.setText(rs.getString("BookTitle"));
            lbl4.setText(rs.getString("BookID"));
            lbl5.setText(rs.getString("Author"));
            lbl6.setText(rs.getString("IssueDate"));
            rs.close();
            pr.close();
        
    }
 
}
}
