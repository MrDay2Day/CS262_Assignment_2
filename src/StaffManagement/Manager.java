/**
 * This package contains classes related to staff management.
 */
package StaffManagement;

/**
 * Represents a Manager, a subclass of StaffMember.
 * Includes additional attributes such as a bonus.
 */
public class Manager extends StaffMember {

    /** The bonus amount for the manager. */
    private final double bonus;

    /**
     * Constructs a Manager with the specified details.
     *
     * @param _firstName The first name of the manager.
     * @param _lastName The last name of the manager.
     * @param _deptNumber The department number the manager belongs to.
     * @param _hoursWorked The number of hours worked by the manager.
     * @param _bonus The bonus amount for the manager.
     */
    public Manager(String _firstName, String _lastName, DeptNumbers _deptNumber, double _hoursWorked, double _bonus) {
        super(_firstName, _lastName, _deptNumber, _hoursWorked);
        this.bonus = _bonus;
    }

    /**
     * Calculates the salary of the manager.
     *
     * @return The calculated salary of the manager including the bonus.
     */
    @Override
    public double calculateSalary() {
        return  (this.getHoursWorked() * 1500) + this.bonus;
    }

    /**
     * Displays the details of the manager, including bonus.
     */
    @Override
    public void display() {
        System.out.println("Staff Type: " + this.getClass().getName());
        super.display();
        System.out.println("Bonus: $" + this.bonus);
    }
}
