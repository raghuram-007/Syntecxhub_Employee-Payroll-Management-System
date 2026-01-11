import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeDAO empDao = new EmployeeDAO();
        PayrollDAO payDao = new PayrollDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Generate Payroll");
            System.out.println("4. View Payroll");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Basic Salary: ");
                    double basic = Double.parseDouble(sc.nextLine());
                    empDao.addEmployee(name, dept, basic);
                    break;

                case 2:
                    empDao.viewEmployees();
                    break;

                case 3:
                    System.out.print("Employee ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("HRA: ");
                    double hra = Double.parseDouble(sc.nextLine());
                    System.out.print("DA: ");
                    double da = Double.parseDouble(sc.nextLine());
                    System.out.print("Deductions: ");
                    double ded = Double.parseDouble(sc.nextLine());
                    payDao.generatePayroll(id, hra, da, ded);
                    break;

                case 4:
                    payDao.viewPayroll();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
