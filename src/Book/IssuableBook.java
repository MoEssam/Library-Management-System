
package Book;

import Database.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class IssuableBook extends Book {
    private String NumberOfTimesIssued;
    private String LastIssueDateTime;
    private String HolderName;
    private String member_id;
    
    public IssuableBook()
    {
        
    }

    public IssuableBook(String NumberOfTimesIssued, String LastIssueDateTime){
        this.NumberOfTimesIssued = NumberOfTimesIssued;
        this.LastIssueDateTime = LastIssueDateTime;
    }
    public IssuableBook(String Title,String LastIssueDateTime,String HolderName,String Author,String ISBN_Number,String member_id) {
        super(Title,Author,ISBN_Number);
        this.HolderName = HolderName;
        this.LastIssueDateTime = LastIssueDateTime;
        this.member_id=member_id;
    }
    
    public IssuableBook(String NumberOfTimesIssued, String LastIssueDateTime,
            String HolderName, String Title, String Author, String SubjectArea,
            String ISBN_Number, String DateAdded, String NumberOfCopies) {
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

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }
    
     public String issue(String BookTitle,String HolderName,String memberid,String BookID,String IssueDate,String Author)
    {
         String sqlInsrt="INSERT INTO issue(HolderName,memberid,BookTitle,BookID,Author,IssueDate) VALUES(?,?,?,?,?,?)";
        try{
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(sqlInsrt);
            stmt.setString(1,HolderName);
            stmt.setString(2,memberid);
            stmt.setString(3,BookTitle);
            stmt.setString(4,BookID);
            stmt.setString(5,Author);
            stmt.setString(6,IssueDate);
            stmt.execute();
            conn.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    
}
