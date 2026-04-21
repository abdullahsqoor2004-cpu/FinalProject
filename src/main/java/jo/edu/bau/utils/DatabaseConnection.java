package jo.edu.bau.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static Connection conn;

    public static Connection getConnection() {

        try {

            if (conn == null || conn.isClosed()) {

                Class.forName("oracle.jdbc.driver.OracleDriver");

                conn = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:XE",
                        "hr",
                        "hr"
                );

                System.out.println("Database Connected ✔");

            }

        } catch (Exception e) {
            System.out.println("Database Connection Error:");
            e.printStackTrace();
        }

        return conn;
    }
}