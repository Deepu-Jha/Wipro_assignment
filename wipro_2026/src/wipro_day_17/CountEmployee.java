package wipro_day_17;
import java.sql.*;

public class CountEmployee {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wipro_db3",
            "root",
            "Deepujha123@");

            String query =
            "select count(*) from employees1";

            PreparedStatement ps =
            con.prepareStatement(query);

            ResultSet rs =
            ps.executeQuery();

            if(rs.next()) {

                System.out.println(
                "Total Employees = "+
                rs.getInt(1));
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}