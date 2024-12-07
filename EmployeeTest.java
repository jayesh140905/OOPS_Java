import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee() {
        this.firstName = "Default";
        this.lastName = "Employee";
        this.monthlySalary = 1000; // Default positive value
    }

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public void setMonthlySalary(double monthlySalary) {
        Scanner scanner = new Scanner(System.in);
        while (monthlySalary <= 0) {
            System.out.print("Monthly salary must be positive. Re-enter salary: ");
            monthlySalary = scanner.nextDouble();
        }
        this.monthlySalary = monthlySalary;
    }

    public double getYearlySalary() {
        return this.monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        this.monthlySalary += this.monthlySalary * (percentage / 100);
    }

    public void display() {
        System.out.println("Employee Information:");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Monthly Salary: " + this.monthlySalary);
        System.out.println("Yearly Salary: " + getYearlySalary());
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 3000);
        Employee employee2 = new Employee("Jane", "Smith", 4000);

        System.out.println("Before Raise:");
        employee1.display();
        System.out.println();
        employee2.display();

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("\nAfter 10% Raise:");
        employee1.display();
        System.out.println();
        employee2.display();
    }
}
