package day_26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnect {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/seleniumdatabase";
        String username = "root";
        String password = "root@123";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM admin_login");

            // Display Data
            while(rs.next()) {

                int id = rs.getInt("id");
                String user = rs.getString("username");
                String pass = rs.getString("password");

                System.out.println("ID : " + id);
                System.out.println("Username : " + user);
                System.out.println("Password : " + pass);
                System.out.println("-------------------");
            }
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}