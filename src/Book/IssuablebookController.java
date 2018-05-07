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
    private TableColumn<IssuableBook, String> noOftimesissued;
    @FXML
    private TableColumn<IssuableBook, String> lasttimeissued;
    private String sql= "SELECT * FROM issue";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            conn = dbConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ViewMembersController.class.getName()).log(Level.SEVERE, null, ex);
        }
        issue=FXCollections.observableArrayList();
    } 
    private void LoadMembersData(){
            
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                issue.add(new IssuableBook());
            }    
        } catch (SQLException ex) {
            Logger.getLogger(ViewMembersController.class.getName()).log(Level.SEVERE, null, ex);
        }
        booktitile.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        holdername.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        noOftimesissued.setCellValueFactory(new PropertyValueFactory<>("dateofbirth"));
        //lasttimeissued.setCellValueFactory(new PropertyValueFactory<>("date_of_membership")); 
        issuablebook.setItems(null);
        issuablebook.setItems(issue);
    }
    
}
