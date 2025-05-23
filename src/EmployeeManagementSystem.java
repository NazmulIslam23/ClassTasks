// Base class
abstract class Employee {
    String name;
    int id;
    String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public abstract double calculatePay();

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Department: " + department);
    }
}

class FullTimeEmployee extends Employee {
    double fixedSalary;

    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    String projectName;
    double contractAmount;

    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 101, "HR", 50000);
        Employee e2 = new PartTimeEmployee("Bob", 102, "Support", 200, 20);
        Employee e3 = new ContractEmployee("Charlie", 103, "IT", "Website Redesign", 80000);

        e1.displayInfo();
        System.out.println("Pay: $" + e1.calculatePay());
        System.out.println();

        e2.displayInfo();
        System.out.println("Pay: $" + e2.calculatePay());
        System.out.println();

        e3.displayInfo();
        System.out.println("Pay: $" + e3.calculatePay());
    }
}
