/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarian;

/**
 *
 * @author mahmoud
 */
public class FacultyMember extends MembersData{
    String CollegeName;
    String Employee;
    
    
    

    public FacultyMember(String firstname, String middleinitial, String lastname, String dateofbirth, String date_of_membership, String address, String contactnumber, String emailaddress) {
        super(firstname, middleinitial, lastname, dateofbirth, date_of_membership, address, contactnumber, emailaddress);
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
