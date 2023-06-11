package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Db_03_PreparedStatement {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jc.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/singh";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt = con.prepareStatement("select * from exam where Roll No=?");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Roll No: ");
            int rollNo = sc.nextInt();

            stmt.setInt(2, rollNo);
            ResultSet rs = stmt.executeQuery();

            String name = "";
            String city = "";
            int phoneNo = 0;

            while (rs.next()) {
                name = rs.getString("Name");
                rollNo = rs.getInt("Roll No");
                city = rs.getString("City");
                phoneNo = rs.getInt("Phno");

                System.out
                        .println("Name: " + name + " Roll No: " + rollNo + " City: " + city + " Phone No: " + phoneNo);
            }
            stmt.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
