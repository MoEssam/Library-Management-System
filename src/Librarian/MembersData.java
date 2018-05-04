package Librarian;

/*import Login.Librarian;*/

public class MembersData  {
    
    protected  String firstname;
    protected String middleinitial;
    protected  String lastname;
    protected String dateofbirth;
    protected String date_of_membership;
    protected  String address;
    protected String contactnumber;
    protected String emailaddress;

    public MembersData(String firstname, String middleinitial, String lastname, String dateofbirth, String date_of_membership, String address, String contactnumber, String emailaddress) {
        this.firstname = firstname;
        this.middleinitial = middleinitial;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.date_of_membership = date_of_membership;
        this.address = address;
        this.contactnumber = contactnumber;
        this.emailaddress = emailaddress;
    }
    

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddleinitial() {
        return middleinitial;
    }
    public void setMiddleinitial(String middleinitial) {
        this.middleinitial = middleinitial;
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
    public void setDate_of_membership(String dateofmembership) {
        this.date_of_membership= dateofmembership;
    }

    public String getAddress() {
        return address;
    }
    public void setAdress(String address)
    {
        this.address=address;
    }
    

    public String getContactnumber() {
        return contactnumber;
    }
     public void setContactnumber(String contactnumber)
    {
        this.contactnumber=contactnumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
     public void setEmailaddreess(String emailaddress)
    {
        this.emailaddress=emailaddress;
    }
    
    
    
}
