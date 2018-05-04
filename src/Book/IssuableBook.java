
package Book;


public class IssuableBook extends Book {
    private int NumberOfTimeIssued;
    private int LastIssueDateTime;
    private String IssuanceID;
    
    public IssuableBook()
    {
        
    }

    public IssuableBook(int NumberOfTimeIssued, int LastIssueDateTime, String IssuanceID) {
        this.NumberOfTimeIssued = NumberOfTimeIssued;
        this.LastIssueDateTime = LastIssueDateTime;
        this.IssuanceID = IssuanceID;
    }

    public IssuableBook(int NumberOfTimeIssued, int LastIssueDateTime,
            String IssuanceID, String Tittle, String Author, String SubjectArea,
            String ISBN_Number, String DateAdded, String NumberOfCopies) {
        super(Tittle, Author, SubjectArea, ISBN_Number, DateAdded, NumberOfCopies);
        this.NumberOfTimeIssued = NumberOfTimeIssued;
        this.LastIssueDateTime = LastIssueDateTime;
        this.IssuanceID = IssuanceID;
    }

    public int getNumberOfTimeIssued() {
        return NumberOfTimeIssued;
    }

    public void setNumberOfTimeIssued(int NumberOfTimeIssued) {
        this.NumberOfTimeIssued = NumberOfTimeIssued;
    }

    public int getLastIssueDateTime() {
        return LastIssueDateTime;
    }

    public void setLastIssueDateTime(int LastIssueDateTime) {
        this.LastIssueDateTime = LastIssueDateTime;
    }

    public String getIssuanceID() {
        return IssuanceID;
    }

    public void setIssuanceID(String IssuanceID) {
        this.IssuanceID = IssuanceID;
    }
    
    
    
}
