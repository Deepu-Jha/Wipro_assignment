package wipro_day_17;
import java.sql.*;

public class DeleteEmployee {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wipro_db3",
            "root",
            "Deepujha123@");

            String query =
            "delete from employees1 where emp_id=?";

            PreparedStatement ps =
            con.prepareStatement(query);

            ps.setInt(1,3);

            int rows =
            ps.executeUpdate();

            System.out.println(
            rows+" Row Deleted");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}