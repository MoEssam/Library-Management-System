/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import Database.dbConnection;
import Librarian.MembersData;
import Librarian.ViewMembersController;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Antr
 */
public class IssuablebookController implements Initializable {
    private Connection conn=null;
     private dbConnection db;
    private ObservableList<IssuableBook> issue;
    @FXML
    private TableView<IssuableBook> issuablebook;
    @FXML
    private TableColumn<IssuableBook, String> booktitile;
    @FXML
    private TableColumn<IssuableBook, String> holdername;
    @FXML
    private TableColumn<IssuableBook, String> memberid;
    @FXML
    private TableColumn<IssuableBook, String> bookid;
    @FXML
    private TableColumn<IssuableBook, String> author;
    @FXML
    private TableColumn<IssuableBook, String> date;
    private String sql= "SELECT * FROM issue";
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            conn = dbConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ViewMembersController.class.getName()).log(Level.SEVERE, null, ex);
        }
        issue=FXCollections.observableArrayList();
        Loadissue();
    } 
    private void Loadissue(){
            
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                issue.add(new IssuableBook(rs.getString("BookTitle"), rs.getString("IssueDate"), rs.getString("Author"),rs.getString("HolderName"),rs.getString("BookID"),rs.getString("memberid")));
            }    
        } catch (SQLException ex) {
            Logger.getLogger(ViewMembersController.class.getName()).log(Level.SEVERE, null, ex);
        }
        booktitile.setCellValueFactory(new PropertyValueFactory<>("Title"));
        holdername.setCellValueFactory(new PropertyValueFactory<>("Author"));
        memberid.setCellValueFactory(new PropertyValueFactory<>("member_id"));
        bookid.setCellValueFactory(new PropertyValueFactory<>("ISBN_Number"));
        author.setCellValueFactory(new PropertyValueFactory<>("HolderName"));
        date.setCellValueFactory(new PropertyValueFactory<>("LastIssueDateTime"));
       
        issuablebook.setItems(null);
        issuablebook.setItems(issue);
    }
    
}
