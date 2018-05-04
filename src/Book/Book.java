package Book;

import Database.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class Book {
    private String Title;
    private String Author;
    private String SubjectArea;
    private String ISBN_Number;
    private String DateAdded;
    private String NumberOfCopies;
    
    
    public Book()
    {
        
    }

    public Book(String Title, String Author, String SubjectArea, String ISBN_Number, String DateAdded, String NumberOfCopies) {
        this.Title = Title;
        this.Author = Author;
        this.SubjectArea = SubjectArea;
        this.ISBN_Number = ISBN_Number;
        this.DateAdded = DateAdded;
        this.NumberOfCopies = NumberOfCopies;
    }
    
    
    

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getSubjectArea() {
        return SubjectArea;
    }

    public void setSubjectArea(String SubjectArea) {
        this.SubjectArea = SubjectArea;
    }

    public String getISBN_Number() {
        return ISBN_Number;
    }

    public void setISBN_Number(String ISBN_Number) {
        this.ISBN_Number = ISBN_Number;
    }

    public String getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(String DateAdded) {
        this.DateAdded = DateAdded;
    }

    public String getNumberOfCopies() {
        return NumberOfCopies;
    }

    public void setNumberOfCopies(String NumberOfCopies) {
        this.NumberOfCopies = NumberOfCopies;
    }

    
   
    
    /*public String AddToCatalogue()
    {
        
    }
    
    public String RemoveFromCatalogue()
    {
        
    }
    
    public boolean isAvailable()
    {
        
    }*/
    
    public String Update(String title,String id,String author)
    {
         String sqlInsrt="INSERT INTO book(title,id,author) VALUES(?,?,?)";
        try{
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(sqlInsrt);
            stmt.setString(1,title);
            stmt.setString(2,id);
            stmt.setString(3,author);
            stmt.execute();
            conn.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}

    
   /*public String removeBook()
   {
       
   }*/


    
