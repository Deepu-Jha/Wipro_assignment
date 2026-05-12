package wipro_day_17;
import java.sql.*;

public class LoginValidation {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wipro_db3",
            "root",
            "Deepujha123@");

            String username = "admin";
            String password = "1234";

            String query =
            "select * from users where username=? and password=?";
            PreparedStatement ps =
            con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs =
            ps.executeQuery();

            if(rs.next()) {

                System.out.println(
                "Login Successful");
            }
            else {

                System.out.println(
                "Invalid Login");
            }

            con.close();
        } catch(Exception e) {

            System.out.println(e);
        }
    }
}