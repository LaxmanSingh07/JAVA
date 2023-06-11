package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Db_04_DML_Update {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/singh";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            // DML - Data Manipulation Language

            Statement stmt = con.createStatement();

            stmt.executeUpdate("update exam set Name = 'Rahul' where `Roll No` = 32");
            stmt.close();
            con.close();

            System.out.println("Hnji");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
