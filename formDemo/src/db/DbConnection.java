package db;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

    public class DbConnection {
        public static void connectDB(){
            String url = "jdbc:postgresql://localhost:5432/registration";
            String user = "postgres";
            String password = "root";
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the PostgresSQL server successfully.");
                // Perform database operations
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        public static void main(String[] args) {
        }
    }
