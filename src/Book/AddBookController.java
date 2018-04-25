package Book;

import Database.dbConnection;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class AddBookController implements Initializable {

    @FXML
    private JFXTextField tittle;
    @FXML
    private JFXTextField id;
    @FXML
    private JFXTextField author;
    @FXML
    private JFXTextField publisher;
    @FXML
    private JFXButton save;
    @FXML
    private JFXButton cancel;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void handleSaveBtnAction(ActionEvent event) throws SQLException {
        String sqlInsrt="INSERT INTO Book(title,id,author,publisher) VALUES(?,?,?,?)";
        try{
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(sqlInsrt);
            //stmt.setString(1,);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCancelBtnAction(ActionEvent event) {
    }
    
    
}
