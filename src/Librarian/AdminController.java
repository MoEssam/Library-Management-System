package Librarian;

import Book.AddBookController;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AdminController implements Initializable {


    @FXML
    private JFXTextField enterbookid;
    @FXML
    private JFXTextField entermemberid;
    @FXML
    private JFXTextField bookId;
    @FXML
    private JFXButton submission;
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
    //@FXML
    //private Tab bookissue;
    @FXML
    private Label namebook;
    @FXML
    private Label authorname;
    @FXML
    private Label member_name;
    @FXML
    private Label contactnumber;
    @FXML
    private ImageView add_book_img;
    @FXML
    private ImageView view_mem_img;
    @FXML
    private ImageView catalogue_img;
    @FXML
    private ImageView issue_img;
    @FXML
    private ImageView add_member_img;
    @FXML
    private JFXButton renewbtn;




    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    


    @FXML
    private void handleRenewBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleSubmissionBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleAddMemBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleAddBookBtnAction(ActionEvent event) throws IOException {
           //ImageView iv = new ImageView(getClass().getResource("/images/useralt128.png").toExternalForm());
         //ImageView iv1 = new ImageView(getClass().getResource("/images/addbooks.png").toExternalForm());
         Image image =new Image("/images/useralt128.png");
         add_member_img.setImage(image);
         
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
    private void handleViewMemBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleViewBooksBtnAction(ActionEvent event) {
    }

    @FXML
    private void handleSettingsBtnAction(ActionEvent event) {
    }


    
}
