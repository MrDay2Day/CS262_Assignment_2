package StaffManagement;

public class SalesRep extends StaffMember {
    protected double allowance;
    public SalesRep(String _firstName, String _lastName, DeptNumbers _deptNumber, double _hoursWorked, double _allowance) {
        super(_firstName, _lastName, _deptNumber, _hoursWorked);
        this.allowance = _allowance;
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
        return  (this.hoursWorked * 1500) + this.allowance;
    }

    @Override
    public void display() {
        System.out.println("Staff Type: Sales Representative");
        super.display();
        System.out.println("Allowance: $" + this.allowance);
    }
}
