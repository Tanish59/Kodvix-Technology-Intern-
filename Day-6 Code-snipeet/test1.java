// Base Employee class
class Employee {
    String name, address, gender;
    int age;

    public Employee(String name, int age, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address + ", Gender: " + gender);
    }
}

// FullTimeEmployee class inheriting Employee
class FullTimeEmployee extends Employee {
    double salary;
    String designation;

    public FullTimeEmployee(String name, int age, String address, String gender, double salary, String designation) {
        super(name, age, address, gender);
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary + ", Designation: " + designation);
    }
}

// PartTimeEmployee class inheriting Employee
class PartTimeEmployee extends Employee {
    int workingHours;
    double ratePerHour;

    public PartTimeEmployee(String name, int age, String address, String gender, int workingHours, double ratePerHour) {
        super(name, age, address, gender);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    public double calculatePay() {
        return workingHours * ratePerHour;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Working Hours: " + workingHours + ", Rate per Hour: " + ratePerHour);
        System.out.println("Amount Payable: " + calculatePay());
    }
}

// Main class to test the implementation
public class test1 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 30, "123 Street, NY", "Female", 50000, "Manager");
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 25, "456 Avenue, LA", "Male", 20, 15);

        System.out.println("Full-Time Employee Details:");
        fullTimeEmp.display();

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmp.display();
    }
}
