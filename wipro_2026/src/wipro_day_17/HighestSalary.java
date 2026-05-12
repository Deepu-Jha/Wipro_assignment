package wipro_day_17;
import java.sql.*;

public class HighestSalary {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wipro_db3",
            "root",
            "Deepujha123@");

            String query =
            "select * from employees1 order by salary desc limit 1";

            PreparedStatement ps =
            con.prepareStatement(query);

            ResultSet rs =
            ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                rs.getInt(1)+" "+
                rs.getString(2)+" "+
                rs.getInt(4));
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}