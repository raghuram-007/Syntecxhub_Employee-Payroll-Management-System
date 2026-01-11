import java.sql.*;

public class PayrollDAO {

    public void generatePayroll(int empId, double hra, double da, double deductions) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps1 =
                con.prepareStatement("SELECT basic_salary FROM employees WHERE emp_id=?");
            ps1.setInt(1, empId);
            ResultSet rs = ps1.executeQuery();

            if (!rs.next()) {
                System.out.println("❌ Employee not found");
                return;
            }

            double basic = rs.getDouble(1);
            double netSalary = basic + hra + da - deductions;

            PreparedStatement ps2 = con.prepareStatement(
                "INSERT INTO payroll(emp_id, hra, da, deductions, net_salary) VALUES(?,?,?,?,?)"
            );
            ps2.setInt(1, empId);
            ps2.setDouble(2, hra);
            ps2.setDouble(3, da);
            ps2.setDouble(4, deductions);
            ps2.setDouble(5, netSalary);
            ps2.executeUpdate();

            System.out.println("✅ Payroll Generated");
            System.out.println("Net Salary: Rs." + netSalary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewPayroll() {
        try (Connection con = DBConnection.getConnection()) {
            String sql =
                "SELECT e.emp_id, e.name, p.net_salary " +
                "FROM employees e JOIN payroll p ON e.emp_id = p.emp_id";

            ResultSet rs = con.createStatement().executeQuery(sql);
            System.out.println("ID | Name | Net Salary");
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " | " +
                    rs.getString(2) + " | Rs." +
                    rs.getDouble(3)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
