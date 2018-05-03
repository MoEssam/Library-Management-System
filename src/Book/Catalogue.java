
package Book;


public class Catalogue {
    
    private String Name;
    private String CreatedBy;
    private int TotalBooks;
    private Book book;
    
    public Catalogue()
    {
        book = new Book();
    }
    
    public Catalogue(String Name, String CreatedBy, int TotalBooks, Book book)
    {
        this.Name=Name;
        this.CreatedBy=CreatedBy;
        this.TotalBooks=TotalBooks;
        this.book=book;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public int getTotalBooks() {
        return TotalBooks;
    }

    public void setTotalBooks(int TotalBooks) {
        this.TotalBooks = TotalBooks;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    public void addBook()
    {
        
    }
    
    public void removeBook()
    {
        
    }
    
    public void showDescription(){
        
    }
    
    public void showBookDetails()
    {
       
    }
    
    public void showIssueHistory()
    {
        
    }
}
