package databasepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;

public class DbConnect {

    public static Connection connect() {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:xe", user = "todo", password = "todo";
            DriverManager.registerDriver(new OracleDriver());
            return DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            System.err.println(ex);
            return null;
        }
    }
}
