package jdbc;
import java.sql.*;
public class FetchData_Ex {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wipro_db2",
                    "root",
                    "Deepujha123@"
            );
            String query = "select * from employees";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.println("Employee Details");
            System.out.println("-------------------------");
            while(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int deptId = rs.getInt(3);
                double salary = rs.getDouble(4);
                System.out.println(
                        id + " " +
                        name + " " +
                        deptId + " " +
                        salary
                );
            }
            con.close();
        } catch(Exception e) {

            System.out.println(e);
        }
    }
}