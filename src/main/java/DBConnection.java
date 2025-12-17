package hei.school.minidish.config;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final Dotenv dotenv = Dotenv.load();

    public static Connection getDBConnection() {
        try {
            return DriverManager.getConnection(
                    dotenv.get("JDBC_URL"),
                    dotenv.get("USERNAME"),
                    dotenv.get("PASSWORD")
            );
        } catch (Exception e) {
            throw new RuntimeException("Erreur connexion DB", e);
        }
    }
}
