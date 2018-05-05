
package Librarian;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class ViewMembersController implements Initializable {

    @FXML
    private TableView<MembersData> viewmember;
    @FXML
    private TableColumn<MembersData, String> firstname;
    @FXML
    private TableColumn<MembersData, String> lastname;
    @FXML
    private TableColumn<MembersData, String> dateofbirth;
    @FXML
    private TableColumn<MembersData, String> dateofmembership;
    @FXML
    private TableColumn<MembersData, String> address;
    @FXML
    private TableColumn<MembersData, String> contactnumber;
    @FXML
    private TableColumn<MembersData, String> emailadress;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
