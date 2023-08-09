package servlets.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	
//    private static final String URL = "jdbc:postgresql://localhost:5432/teste_new";
//    private static final String USER = "postgres";
//    private static final String PASSWORD = "91095850";
	
  private static final String URL = "jdbc:Mysql://localhost:3306/cadastro";
  private static final String USER = "root";
  private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
//            Class.forName("org.postgresql.Driver");
        	Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}