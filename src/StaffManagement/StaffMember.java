package StaffManagement;

abstract class StaffMember {
    public String firstName;
    public String lastName;
    protected DeptNumbers deptNumber;
    protected double hoursWorked;

    public StaffMember(String _firstName, String _lastName, DeptNumbers _deptNumber, double _hoursWorked){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.deptNumber = _deptNumber;
        this.hoursWorked = _hoursWorked;
    }

    abstract double calculateSalary();

   public void display(){
       System.out.println("Name: " + this.firstName + " " + this.lastName );
       System.out.println("Department #: " + this.deptNumber);
       System.out.println("Hours Worked: " + this.hoursWorked);
   }
}
