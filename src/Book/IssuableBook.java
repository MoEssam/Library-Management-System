
package Book;


public class IssuableBook extends Book {
    private int NumberOfTimesIssued;
    private int LastIssueDateTime;
    private String HolderName;
    
    public IssuableBook()
    {
        
    }

    public IssuableBook(int NumberOfTimesIssued, int LastIssueDateTime, String HolderName) {
        this.NumberOfTimesIssued = NumberOfTimesIssued;
        this.LastIssueDateTime = LastIssueDateTime;
        this.HolderName = HolderName;
    }

    public IssuableBook(int NumberOfTimesIssued, int LastIssueDateTime,
            String HolderName, String Tittle, String Author, String SubjectArea,
            String ISBN_Number, String DateAdded, String NumberOfCopies) {
        super(Tittle, Author, SubjectArea, ISBN_Number, DateAdded, NumberOfCopies);
        this.NumberOfTimesIssued = NumberOfTimesIssued;
        this.LastIssueDateTime = LastIssueDateTime;
        this.HolderName = HolderName;
    }

    public int getNumberOfTimesIssued() {
        return NumberOfTimesIssued;
    }

    public void setNumberOfTimesIssued(int NumberOfTimeIssued) {
        this.NumberOfTimesIssued = NumberOfTimeIssued;
    }

    public int getLastIssueDateTime() {
        return LastIssueDateTime;
    }

    public void setLastIssueDateTime(int LastIssueDateTime) {
        this.LastIssueDateTime = LastIssueDateTime;
    }

    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String HolderName) {
        this.HolderName = HolderName;
    }
    
    
    
}
