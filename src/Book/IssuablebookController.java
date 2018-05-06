/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Antr
 */
public class IssuablebookController implements Initializable {

    @FXML
    private TableView<?> issuablebook;
    @FXML
    private TableColumn<?, ?> booktitile;
    @FXML
    private TableColumn<?, ?> holdername;
    @FXML
    private TableColumn<?, ?> noOftimesissued;
    @FXML
    private TableColumn<?, ?> lasttimeissued;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
