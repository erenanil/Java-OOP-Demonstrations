package InheritanceEN;

// Manager class, inherits from Employee
class Manager extends Employee {
    // Extra property for Manager
    int teamSize; // The number of teams the manager oversees

    // Manager's constructor, calling the parent class's constructor
    public Manager(String name, String department, double salary, int teamSize) {
        super(name, department, salary); // Calling the parent class's constructor
        this.teamSize = teamSize;
    }

    // Manager's unique method
    public void manageTeam() {
        System.out.println(this.name + " is managing the team in the " + this.department + " department.");
    }

    // Overriding method to show manager's info
    @Override
    public void showInfo() {
        super.showInfo(); // Calling the parent class's showInfo method
        System.out.println("Number of Teams Managed: " + teamSize);
    }
}

