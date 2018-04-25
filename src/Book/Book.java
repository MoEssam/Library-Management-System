package Book;


public class Book {
    private String Tittle;
    private String Author;
    private String SubjectArea;
    private String ISBN_Number;
    private String DateAdded;
    private String NumberOfCopies;

    public Book() 
    {
    }
    
    public Book(String Tittle, String Author, String SubjectArea,String ISBN_Number, String DateAdded, String NumberOfCopies  )
    {
        this.Tittle=Tittle;
        this.Author=Author;
        this.DateAdded=DateAdded;
        this.ISBN_Number=ISBN_Number;
        this.NumberOfCopies=NumberOfCopies;
        this.SubjectArea=SubjectArea;
    }
    
    public String getTittle()
    {
        return Tittle;
    }
    
    public void setTittle(String Tittle)
    {
        this.Tittle=Tittle;
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
        
    }
    
    public String Update()
    {
        
    }
    
   public String removeBook()
   {
       
   }*/
}

    
