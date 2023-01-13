import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBaseManagement {
    public static final String url = "jdbc:mysql://localhost:3306/employee_payroll";
    public static final String userName = "root";
    public static final String password = "Omkar@12";

    public static void dataBaseManagement() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            if (connection != null) {
                System.out.println("Database Connected Successfully!!!");
            }

        } catch (SQLException e) {
            System.out.println("Exception Occurs" + e);
        }
    }

    public static void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement prepare = connection.prepareStatement("update EmployeePayroll set basicpay = ? where id = ?;");
            System.out.print("Enter id = ");
            int id = scanner.nextInt();
            System.out.print("Enter basic pay = ");
            int basicpay = scanner.nextInt();
            prepare.setInt(1, basicpay);
            prepare.setInt(2, id);
            prepare.executeLargeUpdate();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static void main(String[] args) {
        dataBaseManagement();
        updateSalary();
    }
}
