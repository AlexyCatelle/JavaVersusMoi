package jdbcExo1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URI  = "jdbc:mysql://localhost:3306/demo_jdbc";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "bq2PQaoyZH6&L3hE";

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URI,USERNAME,PASSWORD);
    }
}
