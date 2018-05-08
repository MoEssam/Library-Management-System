
package Book;

import Database.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class IssuableBook extends Book {
    private String NumberOfTimesIssued;
    private String LastIssueDateTime;
    private String HolderName;
    
    public IssuableBook()
    {
        
    }

    public IssuableBook(String NumberOfTimesIssued, String LastIssueDateTime){
        this.NumberOfTimesIssued = NumberOfTimesIssued;
        this.LastIssueDateTime = LastIssueDateTime;
    }
    public IssuableBook(String Title,String LastIssueDateTime,String HolderName) {
        super(Title);
        this.HolderName = HolderName;
         this.LastIssueDateTime = LastIssueDateTime;
    }
    
    public IssuableBook(String NumberOfTimesIssued, String LastIssueDateTime,
            String HolderName, String Title, String Author, String SubjectArea,
            String ISBN_Number, String DateAdded, int NumberOfCopies) {
        super(Title, Author, SubjectArea, ISBN_Number, DateAdded, NumberOfCopies);
        this.NumberOfTimesIssued = NumberOfTimesIssued;
        this.LastIssueDateTime = LastIssueDateTime;
        this.HolderName = HolderName;
    }

    public String getNumberOfTimesIssued() {
        return NumberOfTimesIssued;
    }

    public void setNumberOfTimesIssued(String NumberOfTimeIssued) {
        this.NumberOfTimesIssued = NumberOfTimeIssued;
    }

    public String getLastIssueDateTime() {
        return LastIssueDateTime;
    }

    public void setLastIssueDateTime(String LastIssueDateTime) {
        this.LastIssueDateTime = LastIssueDateTime;
    }

    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String HolderName) {
        this.HolderName = HolderName;
    }
     public String issue(String BookTitle,String HolderName,String issuenumber,String DateAdded)
    {
         String sqlInsrt="INSERT INTO issue(BookTitle,HolderName,Number,DateAdded) VALUES(?,?,?,?)";
        try{
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(sqlInsrt);
            stmt.setString(1,BookTitle);
            stmt.setString(2,HolderName);
            stmt.setString(3,issuenumber);
            stmt.setString(4,DateAdded);
            stmt.execute();
            conn.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    
}
