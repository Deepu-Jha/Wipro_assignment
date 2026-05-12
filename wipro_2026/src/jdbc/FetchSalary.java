package jdbc;
import java.sql.*;
public class FetchSalary {
    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wipro_db2",
            "root",
            "Deepujha123@");

            String query =
            "select * from employees where salary > ?";

            PreparedStatement ps =
            con.prepareStatement(query);

            ps.setDouble(1,50000);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                rs.getInt(1)+" "+
                rs.getString(2)+" "+
                rs.getDouble(4));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
