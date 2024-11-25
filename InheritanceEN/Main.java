package InheritanceEN;

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object from the Employee class
        Employee employee = new Employee("Anil", "Accounting", 5000);
        employee.work(); // Output: Anil is working.
        employee.showInfo(); // Output: Name: Anil, Department: Accounting, Salary: 5000 USD

        // Creating an object from the Manager class
        Manager manager = new Manager("Eda", "Marketing", 8000, 5);
        manager.work(); // Output: Eda is working.
        manager.manageTeam(); // Output: Eda is managing the team in the Marketing department.
        manager.showInfo(); // Output: Name: Eda, Department: Marketing, Salary: 8000 USD, Number of Teams Managed: 5
    }
}
