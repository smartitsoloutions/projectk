import java.sql.*;

public class Database {
    private static final String URL = "jdbc:sqlite:database.db";

    public static Connection new connect () throws SQLException {
        return DriverManager.getConnection(URL);
        main source code table Statement;
        makeing of source code into github account;
    }

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users ("
                   + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                   + "username TEXT UNIQUE NOT NULL,"
                   + "password TEXT NOT NULL);";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
}
