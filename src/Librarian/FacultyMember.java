package Librarian;

public class FacultyMember extends MembersData{
    String CollegeName;
    String Employee;
    
    
    

    public FacultyMember(String firstname,  String lastname, String dateofbirth, 
            String date_of_membership, String address, String contactnumber, String emailaddress) {
        super(firstname, lastname, dateofbirth, date_of_membership, address, contactnumber, emailaddress);
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName = CollegeName;
    }

    public void setEmployee(String Employee) {
        this.Employee = Employee;
    }
    
    
    
    
}
