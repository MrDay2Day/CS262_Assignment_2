/**
 * This package contains classes related to staff management.
 */
package StaffManagement;

/**
 * Represents a Sales Representative, a subclass of StaffMember.
 * Includes additional attributes such as an allowance.
 */
public class SalesRep extends StaffMember {

    /** The allowance amount for the sales representative. */
    private final double allowance;

    /**
     * Constructs a SalesRep with the specified details.
     *
     * @param _firstName The first name of the sales representative.
     * @param _lastName The last name of the sales representative.
     * @param _deptNumber The department number the sales representative belongs to.
     * @param _hoursWorked The number of hours worked by the sales representative.
     * @param _allowance The allowance amount for the sales representative.
     */
    public SalesRep(String _firstName, String _lastName, DeptNumbers _deptNumber, double _hoursWorked, double _allowance) {
        super(_firstName, _lastName, _deptNumber, _hoursWorked);
        this.allowance = _allowance;
    }

    /**
     * Calculates the salary of the sales representative.
     *
     * @return The calculated salary of the sales representative including the allowance.
     */
    @Override
    public double calculateSalary() {
        return  (this.getHoursWorked() * 1500) + this.allowance;
    }

    /**
     * Displays the details of the sales representative, including allowance.
     */
    @Override
    public void display() {
        System.out.println("Staff Type: Sales Representative");
        super.display();
        System.out.println("Allowance: $" + this.allowance);
    }
}
