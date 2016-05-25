package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Matthieu
 */
public final class ConnectionBD {

    private Connection connection;
    public static volatile ConnectionBD instance = null;

    public static ConnectionBD getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new ConnectionBD();
        }
        return instance;
    }

    private ConnectionBD() throws ClassNotFoundException, SQLException {
        super();
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Matthieu\\BDProjetJava.db");

    }

    public Connection getConnection() {
        return connection;
    }
    
    

    public void closeConnection() throws SQLException {
        this.connection.close();
    }
}
