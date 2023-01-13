import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManagement {
    private static final String url = "jdbc:mysql://localhost:3306/employee_payroll";
    private static final String userName = "root";
    private static final String password = "Omkar@12";
    static Connection connection;

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(url, userName, password);
            if (connection != null) {
                System.out.println("Database Connected Successfully!!!");
            }

        } catch (SQLException e) {
            System.out.println("Exception Occurs" + e);
        }
    }
}
