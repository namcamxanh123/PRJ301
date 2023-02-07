import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author FPT University - PRJ301
 */
public class DBContext {

    protected Connection connection;

    public DBContext() {
        try {
            String user = "sa";
            String pass = "12345";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Kiem tra ket noi toi CSDL
    public static void main(String[] args) {
        System.out.println(new DBContext().connection);
    }
}