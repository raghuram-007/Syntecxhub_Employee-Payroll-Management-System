

# 💼 Employee Payroll Management System (Java + JDBC)

A **console-based Employee Payroll Management System** developed using **Core Java, JDBC, and MySQL**.
This project allows organizations to manage employee details, calculate salaries accurately, and generate payroll records securely.

---

## 📌 Project Overview

The Employee Payroll Management System helps in:

* Managing employee records
* Calculating net salaries
* Generating payroll details
* Storing all data securely in a MySQL database

This project is built as part of an **internship / academic project** to demonstrate **Java JDBC CRUD operations** and **database integration**.

---

## 🛠️ Technologies Used

* ☕ **Java (Core Java)**
* 🔗 **JDBC (Java Database Connectivity)**
* 🗄️ **MySQL**
* 🧰 **MySQL Workbench**
* 💻 **VS Code / IntelliJ / Eclipse**

---

## ✨ Features

* ➕ Add new employees
* 👀 View employee details
* 💰 Generate payroll with salary calculation
* 📄 View payroll records
* 🔐 Secure database operations using `PreparedStatement`
* ⚠️ Proper exception handling

---

## 🧮 Salary Calculation Logic

```
Net Salary = Basic Salary + HRA + DA − Deductions
```

Ensures **accurate and reliable payroll processing**.

---

## 🗃️ Database Design

### 📂 Database: `payroll_db`

#### 🧾 Employees Table

| Column       | Type              |
| ------------ | ----------------- |
| emp_id       | INT (Primary Key) |
| name         | VARCHAR           |
| department   | VARCHAR           |
| basic_salary | DOUBLE            |

#### 🧾 Payroll Table

| Column     | Type              |
| ---------- | ----------------- |
| payroll_id | INT (Primary Key) |
| emp_id     | INT (Foreign Key) |
| hra        | DOUBLE            |
| da         | DOUBLE            |
| deductions | DOUBLE            |
| net_salary | DOUBLE            |

---

## 📁 Project Structure

```
Employee-Payroll-Management-System/
│
├── src/
│   ├── Main.java
│   ├── EmployeeDAO.java
│   ├── PayrollDAO.java
│   ├── DBConnection.java
│
├── sql/
│   └── payroll_db.sql
│
├── README.md
└── .gitignore
```

---

## ▶️ How to Run the Project

1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/Employee-Payroll-Management-System.git
```

2️⃣ Import the project into your IDE

3️⃣ Configure MySQL database using `payroll_db.sql`

4️⃣ Update database credentials in `DBConnection.java`

5️⃣ Compile and run:

```bash
javac *.java
java Main
```

---

## 📸 Sample Console Output

```
===== EMPLOYEE PAYROLL SYSTEM =====
1. Add Employee
2. View Employees
3. Generate Payroll
4. View Payroll
5. Exit
```

---

## 🎯 Learning Outcomes

* Strong understanding of JDBC
* Real-world database handling
* CRUD operations in Java
* Secure SQL handling
* Console-based UI design

---

## 🚀 Future Enhancements

* 📊 Detailed payslip generation
* 🖥️ GUI using JavaFX / Swing
* 📤 Export payroll reports (PDF / Excel)
* 🔐 Role-based access control

---

## 👨‍💻 Author

**Raghuram S**
Java Developer Intern


---

## 📜 License

This project is for **educational and internship purposes**.

