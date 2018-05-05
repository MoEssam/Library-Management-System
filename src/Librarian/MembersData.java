package Librarian;

import Database.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*import Login.Librarian;*/

public class MembersData  {
    
    protected  String firstname;
    protected  String lastname;
    protected  String dateofbirth;
    protected  String date_of_membership;
    protected  String address;
    protected  String contactnumber;
    protected  String emailaddress;

    public MembersData(String firstname, String lastname, String dateofbirth, String date_of_membership, String address, String contactnumber, String emailaddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.date_of_membership = date_of_membership;
        this.address = address;
        this.contactnumber = contactnumber;
        this.emailaddress = emailaddress;
    }
    public MembersData()
    {}

    
    
    public String getFirstname()    
    {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateofbirth() {    
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getDate_of_membership() {
        return date_of_membership;
    }

    public void setDate_of_membership(String date_of_membership) {
        this.date_of_membership = date_of_membership;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String add_member(String firstname, String middleinitial, String lastname, String dateofbirth, String date_of_membership, String address, String contactnumber, String emailaddress) {
        String sqlInsrt="INSERT INTO members(firstname,middleinitial,lastname,dateofbirth,date_of_membership,address,contactnumber,emailaddress) VALUES(?,?,?,?,?,?,?,?)";
        try{
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(sqlInsrt);
            stmt.setString(1,firstname);
            stmt.setString(2,middleinitial);
            stmt.setString(3,lastname);
            stmt.setString(4,dateofbirth);
            stmt.setString(5,date_of_membership);
            stmt.setString(6,address);
            stmt.setString(7,contactnumber);
            stmt.setString(8,emailaddress);
            stmt.execute();
            conn.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
}
