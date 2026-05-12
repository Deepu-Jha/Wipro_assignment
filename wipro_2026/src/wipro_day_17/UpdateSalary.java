package wipro_day_17;
import java.sql.*;

public class UpdateSalary {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wipro_db3",
            "root",
            "Deepujha123@");

            String query =
            "update employees1 set salary=? where emp_id=?";

            PreparedStatement ps =
            con.prepareStatement(query);

            ps.setInt(1,80000);
            ps.setInt(2,2);

            int rows =
            ps.executeUpdate();

            System.out.println(
            rows+" Row Updated");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}