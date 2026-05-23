package wipro_day_17;
import java.sql.*;

public class DBConnection {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wipro_db3",
            "root",
            "Deepu123@");

            System.out.println(
            "Database Connected Successfully");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}