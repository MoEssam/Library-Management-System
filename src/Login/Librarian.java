package Login;
import Database.dbConnection;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Librarian {
    private String FirstName;
    private String LastName;
    private String MiddleInitial;
    private String LoginID;
    private String Password;
    private String DateAdded;
    private String EmailAddress;
    private String HomeAddress;

    public Librarian(String FirstName, String LastName, String MiddleInitial, String LoginID, String Password, String DateAdded, String EmailAddress, String HomeAddress) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MiddleInitial = MiddleInitial;
        this.LoginID = LoginID;
        this.Password = Password;
        this.DateAdded = DateAdded;
        this.EmailAddress = EmailAddress;
        this.HomeAddress = HomeAddress;
    }
    public Librarian (String LoginID, String Password){
        this.LoginID = LoginID;
        this.Password = Password;
    }
    
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public String getMiddleInitial() {
        return MiddleInitial;
    }
    public void setMiddleInitial(String MiddleInitial) {
        this.MiddleInitial = MiddleInitial;
    }
    public String getLoginID() {
        return LoginID;
    }
    public void setLoginID(String LoginID) {
        this.LoginID = LoginID;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getDateAdded() {
        return DateAdded;
    }
    public void setDateAdded(String DateAdded) {
        this.DateAdded = DateAdded;
    }
    public String getEmailAddress() {
        return EmailAddress;
    }
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }
    public String getHomeAddress() {
        return HomeAddress;
    }
    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }
    
    Connection connection;
    public Librarian(){
        try{
            this.connection=dbConnection.getConnection();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        if(this.connection == null){
            System.exit(1);    
        }    
    }

    public boolean isDatabaseConnected(){
        
        return this.connection != null;
    }
    public boolean isLogin(String id,String pass)throws SQLException{
        PreparedStatement pr ;
        ResultSet rs ;
        String query = "SELECT * FROM librarian where username = ? and password = ?";
        
        try{
            pr=connection.prepareStatement(query);
            pr.setString(1,id);
            pr.setString(2, pass);
            rs = pr.executeQuery(); 
            return rs.next();
       }
        catch (SQLException e){
            return false;
        }  
    }
}

