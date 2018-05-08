package Librarian;

public class Student extends MembersData {
    String schoolname;
    String schoolnumber;
    
    public Student(String firstname, String lastname, String dateofbirth,
            String date_of_membership, String address, String contactnumber, String emailaddress) {
        super(firstname, lastname, dateofbirth, date_of_membership, address, contactnumber, emailaddress);
    }

    public String getSchoolname() {
        return schoolname;
    }

    public String getSchoolnumber() {
        return schoolnumber;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public void setSchoolnumber(String schoolnumber) {
        this.schoolnumber = schoolnumber;
    }
    
    
}
