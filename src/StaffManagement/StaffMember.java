/**
 * This package contains classes related to staff management.
 */
package StaffManagement;

/**
 * Represents an abstract staff member in an organization.
 * Contains common properties and methods for all staff members.
 */
public abstract class StaffMember {

    /** The first name of the staff member. */
    private final String firstName;

    /** The last name of the staff member. */
    private final String lastName;

    /** The department number the staff member belongs to. */
    private final DeptNumbers deptNumber;

    /** The number of hours the staff member has worked. */
    private final double hoursWorked;

    /**
     * Constructs a StaffMember with the specified details.
     *
     * @param _firstName The first name of the staff member.
     * @param _lastName The last name of the staff member.
     * @param _deptNumber The department number the staff member belongs to.
     * @param _hoursWorked The number of hours worked by the staff member.
     */
    public StaffMember(String _firstName, String _lastName, DeptNumbers _deptNumber, double _hoursWorked){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.deptNumber = _deptNumber;
        this.hoursWorked = _hoursWorked;
    }

    /**
     * Gets the first name of the staff member.
     *
     * @return The first name of the staff member.
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Gets the last name of the staff member.
     *
     * @return The last name of the staff member.
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * Gets the department number of the staff member.
     *
     * @return The department number of the staff member.
     */
    public DeptNumbers getDeptNumber(){
        return this.deptNumber;
    }

    /**
     * Gets the hours worked of the staff member.
     *
     * @return The hours worked of the staff member.
     */
    public double getHoursWorked(){
        return this.hoursWorked;
    }

    /**
     * Abstract method to calculate the salary of the staff member.
     *
     * @return The calculated salary of the staff member.
     */
    protected abstract double calculateSalary();

    /**
     * Displays the details of the staff member.
     */
    public void display(){
        System.out.println("Name: " + this.firstName + " " + this.lastName );
        System.out.println("Department #: " + this.deptNumber);
        System.out.println("Hours Worked: " + this.hoursWorked);
    }
}
