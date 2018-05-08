
package Librarian;

import Database.dbConnection;
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


public class ViewMembersController implements Initializable {
    @FXML
    private TableView<MembersData> viewmember;
    @FXML
    private TableColumn<MembersData, String> firstnamecolumn;
    @FXML
    private TableColumn<MembersData, String> lastnamecolumn;
    @FXML
    private TableColumn<MembersData, String> dateofbirthcolumn;
    @FXML
    private TableColumn<MembersData, String> dateofmembershipcolumn;
    @FXML
    private TableColumn<MembersData, String> addresscolumn;
    @FXML
    private TableColumn<MembersData, String> contactnumbercolumn;
    @FXML
    private TableColumn<MembersData, String> emailadresscolumn;
    private Connection conn=null;
    
    private dbConnection db;
    private String sql= "SELECT * FROM members";
    private ObservableList<MembersData> data;
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        try {
            conn = dbConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ViewMembersController.class.getName()).log(Level.SEVERE, null, ex);
        }
            data=FXCollections.observableArrayList();
            LoadMembersData();

        
        
    }   
    private void LoadMembersData(){
            
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                data.add(new MembersData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewMembersController.class.getName()).log(Level.SEVERE, null, ex);
        }
        firstnamecolumn.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        lastnamecolumn.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        dateofbirthcolumn.setCellValueFactory(new PropertyValueFactory<>("dateofbirth"));
        dateofmembershipcolumn.setCellValueFactory(new PropertyValueFactory<>("date_of_membership"));
        addresscolumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        contactnumbercolumn.setCellValueFactory(new PropertyValueFactory<>("contactnumber"));
        emailadresscolumn.setCellValueFactory(new PropertyValueFactory<>("emailaddress"));
        viewmember.setItems(null);
        viewmember.setItems(data);
    }
    
}
