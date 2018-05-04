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
public class Student extends MembersData {
    String schoolname;
    String schoolnumber;
    
    public Student(String firstname, String middleinitial, String lastname, String dateofbirth, String date_of_membership, String address, String contactnumber, String emailaddress) {
        super(firstname, middleinitial, lastname, dateofbirth, date_of_membership, address, contactnumber, emailaddress);
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
