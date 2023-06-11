// package Database;

import java.sql.*;

public class Db_01 {
    public static void main(String[] args) {
        // if you want to make the sql avaliable for this program without creating
        // object

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // this will load the driver class
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/singh";
            try {
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement(); //it will create a selectStatement object
                ResultSet rs = stmt.executeQuery("select * from exam");

                String name = "";
                int rollNo = 0;
                String city = "";
                int phoneNo = 0;

                while (rs.next()) // it will return true if there is any row in the table
                {
                    name = rs.getString("Name");
                    rollNo = rs.getInt("Roll No");
                    city = rs.getString("City");
                    phoneNo = rs.getInt("Phno");

                    System.out.println(
                            "Name: " + name + " Roll No: " + rollNo + " City: " + city + " Phone No: " + phoneNo);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}