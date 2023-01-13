import java.sql.*;
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
    public static void syncDetailsWithDatabase(){
        Scanner scanner = new Scanner(System.in);
           EmployeePayroll employeePayroll = new EmployeePayroll();
            System.out.print("Enter name = ");
            employeePayroll.setName(scanner.next());
            try {
                Connection connection = DriverManager.getConnection(url, userName, password);
                String query = "select * from EmployeePayroll where name=?";
                PreparedStatement prepare = connection.prepareStatement(query);
                prepare.setString(1, employeePayroll.getName());
                ResultSet result = prepare.executeQuery();
                while (result.next()) {
                    System.out.print("id = ");
                    System.out.print(result.getString("id"));
                    System.out.print("\nName = ");
                    System.out.print(result.getString("name"));
                    System.out.print("\nbasic Pay = ");
                    System.out.print(result.getInt("basicpay"));
                    System.out.println();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
    }
    public static void main(String[] args) {
        dataBaseManagement();
        updateSalary();
        syncDetailsWithDatabase();
    }
}
