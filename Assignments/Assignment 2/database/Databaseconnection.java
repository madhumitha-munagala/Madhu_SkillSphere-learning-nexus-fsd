package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Databaseconnection {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "password");

            if (con != null) {
                System.out.println("Database Connected");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Connection Failed");
        }
    }
}