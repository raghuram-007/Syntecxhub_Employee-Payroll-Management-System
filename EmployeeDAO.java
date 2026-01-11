import java.sql.*;

public class EmployeeDAO {

    public void addEmployee(String name, String dept, double basic) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO employees(name, department, basic_salary) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, basic);
            ps.executeUpdate();
            System.out.println("✅ Employee Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewEmployees() {
        try (Connection con = DBConnection.getConnection()) {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM employees");
            System.out.println("ID | Name | Department | Basic Salary");
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " | " +
                    rs.getString(2) + " | " +
                    rs.getString(3) + " | " +
                    rs.getDouble(4)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
