import java.sql.*;
public class Db_04_DML_Insert {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/singh";
            String user="root";
            String pass="";

            Connection con = DriverManager.getConnection(url, user, pass);
            //DML - Data Manipulation Language

            Statement stmt = con.createStatement();

            stmt.executeUpdate("insert into exam values('Rahul', 4, 'Delhi', 1234567890)");
            stmt.close();
            con.close();
            
            System.out.println("Hnji");

        }catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
