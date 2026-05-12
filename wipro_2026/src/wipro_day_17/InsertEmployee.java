package wipro_day_17;
import java.sql.*;

public class InsertEmployee {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wipro_db3",
            "root",
            "Deepujha123@");

            String query =
            "insert into employees1 values(?,?,?,?)";

            PreparedStatement ps =
            con.prepareStatement(query);

            ps.setInt(1,1);
            ps.setString(2,"Deepu");
            ps.setInt(3,101);
            ps.setInt(4,55000);
            ps.executeUpdate();

            ps.setInt(1,2);
            ps.setString(2,"Rahul");
            ps.setInt(3,102);
            ps.setInt(4,65000);
            ps.executeUpdate();

            ps.setInt(1,3);
            ps.setString(2,"Aman");
            ps.setInt(3,103);
            ps.setInt(4,45000);
            ps.executeUpdate();

            ps.setInt(1,4);
            ps.setString(2,"Karan");
            ps.setInt(3,104);
            ps.setInt(4,70000);
            ps.executeUpdate();

            ps.setInt(1,5);
            ps.setString(2,"Deva");
            ps.setInt(3,105);
            ps.setInt(4,50000);
            ps.executeUpdate();

            System.out.println(
            "5 Records Inserted");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}