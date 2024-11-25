package InheritanceEN;

class Employee {
    // Common properties
    String name;
    String department;
    double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Common method (for Employee)
    public void work() {
        System.out.println(this.name + " is working.");
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary + " USD");
    }
}

