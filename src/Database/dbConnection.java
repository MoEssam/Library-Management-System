package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    //private static final String SQCONN="jdbc:sqlite:Library.sqlite";
    
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn= DriverManager.getConnection("jdbc:sqlite:Library.sqlite");
            //conn.close();
            //Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mohamed Essam\\Desktop\\Library Management System\\LibraryManagementSystem\\src\\Library.sqlite");
            return conn;
            //C:\Users\Mohamed Essam\Desktop\Library Management System\LibraryManagementSystem\src\Library.sqlite
            //return DriverManager.getConnection(SQCONN);
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
