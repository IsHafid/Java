package metier;

import java.sql.*;

public class SingletonConnection {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc");
            connection=DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/catalogue_bd","root","");

        }
		catch(Exception e) {
        e.printStackTrace();
    }
    }

    public static Connection getConnection() {
        return connection;
    }
}
