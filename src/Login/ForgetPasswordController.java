/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Database.dbConnection;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Mohamed Essam
 */
public class ForgetPasswordController implements Initializable {

    @FXML
    private JFXTextField txt1;
    @FXML
    private JFXTextField txt2;
    @FXML
    private JFXTextField txt3;
    @FXML
    private Button btn2;

    Connection conn;
    ResultSet rs;
    PreparedStatement pr;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            conn=dbConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ForgetPasswordController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    
    @FXML
    public void search() throws SQLException{
        String get_id=txt1.getText();
        String sql="SELECT * FROM librarian where id = '"+get_id+"'"  ;
        pr=conn.prepareStatement(sql);
        rs=pr.executeQuery();
        if(rs.next()){
            txt2.setText(rs.getString(1));
            txt3.setText(rs.getString(2));
            rs.close();
            pr.close();
        }
        
     }
}
