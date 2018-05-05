
package Book;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;



public class ViewBookController implements Initializable {

    @FXML
    private TableView<Catalogue> catalogue;
    @FXML
    private TableColumn<Catalogue,String> name;
    @FXML
    private TableColumn<Catalogue,String> createdby;
    @FXML
    private TableColumn<Catalogue,String> totalbooks;
   

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    
    }}
    
