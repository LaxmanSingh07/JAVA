package Database;

import java.sql.DriverManager;
import java.io.Console;
import java.sql.Connection;
import java.sql.Statement;

public class Db_04_DML_Delete {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singh", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("delete from exam where `Roll No` = 4");
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
