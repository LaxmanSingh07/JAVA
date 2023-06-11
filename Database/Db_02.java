
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Db_03_PreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/singh";

            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM exam WHERE `Roll No` = ?");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Roll No: ");
            int rollNo = sc.nextInt();

            stmt.setInt(1, rollNo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("Name");
                int retrievedRollNo = rs.getInt("Roll No");
                String city = rs.getString("City");
                int phoneNo = rs.getInt("Phno");

                System.out.println(
                        "Name: " + name + " Roll No: " + retrievedRollNo + " City: " + city + " Phone No: " + phoneNo);
            }

            stmt.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
