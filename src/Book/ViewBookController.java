
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



public class ViewBookController implements Initializable {

    @FXML
    private TableColumn<Book, String> title;
    @FXML
    private TableColumn<Book, String> author;
    @FXML
    private TableColumn<Book, String> Subject;
    @FXML
    private TableColumn<Book, String> id;
    @FXML
    private TableColumn<Book, String> date;
    @FXML
    private TableColumn<Book, String> number;
    @FXML
    private TableView<Book> book;
     private Connection conn=null;
    
    private dbConnection db;
    private String sql= "SELECT * FROM book";
    private ObservableList<Book> data;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    try {
            conn = dbConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ViewMembersController.class.getName()).log(Level.SEVERE, null, ex);
        }
            data=FXCollections.observableArrayList();
            LoadBooks();
    
    }
    
     private void LoadBooks(){
            
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                data.add(new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewMembersController.class.getName()).log(Level.SEVERE, null, ex);
        }
        title.setCellValueFactory(new PropertyValueFactory<>("Title"));
        author.setCellValueFactory(new PropertyValueFactory<>("Author"));
        Subject.setCellValueFactory(new PropertyValueFactory<>("ISBN_Number"));
        id.setCellValueFactory(new PropertyValueFactory<>("SubjectArea"));
        date.setCellValueFactory(new PropertyValueFactory<>("DateAdded"));
        number.setCellValueFactory(new PropertyValueFactory<>("NumberOfCopies"));
        book.setItems(null);
        book.setItems(data);
    }


}
    
