/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author Antr
 */
public class ReferenceBook extends Book {
    private String ReferenceID;

    
    public ReferenceBook()
    {
        
    }
    
    public ReferenceBook(String ReferenceID) {
        this.ReferenceID = ReferenceID;
    }

    public ReferenceBook(String ReferenceID, String Tittle, String Author, 
            String SubjectArea, String ISBN_Number, String DateAdded,
            String NumberOfCopies) {
        super(Tittle, Author, SubjectArea, ISBN_Number, DateAdded, NumberOfCopies);
        this.ReferenceID = ReferenceID;
    }

    public String getReferenceID() {
        return ReferenceID;
    }

    public void setReferenceID(String ReferenceID) {
        this.ReferenceID = ReferenceID;
    }
    
    
            
    
}
