package jdbc;

import java.sql.*;

public class InsertData_Ex {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wipro_db2",
                    "root",
                    "Deepujha123@"
            );

            Statement st = con.createStatement();

            String query =
                    "INSERT INTO employees VALUES " +
                    "(1,'Deepu',101,25000)," +
                    "(2,'Rahul',102,30000)," +
                    "(3,'Aman',103,28000)," +
                    "(4,'Karan',104,35000)," +
                    "(5,'Deva',105,30000)";

            int rows = st.executeUpdate(query);

            System.out.println(rows + " rows inserted");

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}