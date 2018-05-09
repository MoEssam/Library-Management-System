package Book;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javax.swing.JOptionPane;


public class AddBookController implements Initializable {
    Book b1=new Book();
    @FXML
    private JFXTextField title;
    @FXML
    private JFXTextField id;
    @FXML
    private JFXTextField author;
    @FXML
    private JFXButton save;
    @FXML
    private JFXButton cancel;
    @FXML
    private JFXTextField subjarea;
    @FXML
    private JFXTextField dateadded;
    @FXML
    private JFXTextField numberofcopies;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    @FXML
    private void handleSaveBtnAction(ActionEvent event) throws SQLException { 
        if(validateEmail()){
            b1.Update(title.getText(),author.getText(),id.getText(),subjarea.getText(),dateadded.getText(),numberofcopies.getText());
        }
        
    }

    @FXML
    private void handleCancelBtnAction(ActionEvent event) {
    }
      private boolean validateEmail(){
         if( title.getText().isEmpty()|author.getText().isEmpty()|id.getText().isEmpty()|subjarea.getText().isEmpty()|dateadded.getText().isEmpty()|numberofcopies.getText().isEmpty() ){

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Email address");
            alert.setHeaderText(null);
            alert.setContentText("Please");
            alert.showAndWait();
            return false;
        }
        return true;
    }
    
}
