package StaffManagement;

public class Manager extends StaffMember {
    protected double bonus;
    public Manager(String _firstName, String _lastName, DeptNumbers _deptNumber, double _hoursWorked, double _bonus) {
        super(_firstName, _lastName, _deptNumber, _hoursWorked);
        this.bonus = _bonus;
    }

    /**
     * 6. Demonstrating Polymorphism (4 Marks)
     * o Override the display() method in both the Manager and SalesRep subclasses to display
     * additional attributes specific to each subclass.
     * o Demonstrate polymorphism within the Payroll class by calling the overridden display()
     * methods
     * @return double
     */
    @Override
    public double calculateSalary() {
        return  (this.hoursWorked * 1500) + this.bonus;
    }
    @Override
    public void display() {
        System.out.println("Staff Type: " + this.getClass().getName());
        super.display();
        System.out.println("Bonus: $" + this.bonus);
    }
}
