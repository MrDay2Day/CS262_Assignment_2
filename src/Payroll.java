import StaffManagement.DeptNumbers;
import StaffManagement.Manager;
import StaffManagement.SalesRep;
import StaffManagement.StaffMember;
import utils.PayStubPrintOut;


import java.util.ArrayList;

/**
 * QUESTION 1. Class Implementation (20 Marks)
 * o Implement each class as per the provided UML diagram, ensuring that relationships and
 * access specifiers are appropriately set to private or protected, where applicable.
 * o Define a parameterized constructor for each class.
 * o Implement appropriate getter and setter methods for all attributes.
 * o Each class must include a display() method that outputs all attribute values, including
 * inherited attributes.
 *
 * File Structure
 *      /src/
 *          /StaffManagement/
 *              - DeptNumbers.java (ENUM String values)
 *              - Manager.java
 *              - SalesRep.java
 *              - StaffMember.java
 *          /utils/
 *              PayStubPrintOut.java (Utility functions to print out pay stubs to .txt file)
 *          - Payroll.java (Main class for the application)
 * --
 * QUESTION 2. Testing with Payroll Class (1 Mark)
 * o Create a class named Payroll to serve as the Main class for the application.
 */
public class Payroll {
    public static void main(String[] args) {

        /*
         * QUESTION 3. Object Instantiation and Display (1 Mark)
         * o Within the Payroll class, instantiate an object of the StaffMember class using its
         * constructor.
         * o Invoke the display() method on this object to print the StaffMember data values.
         */
       StaffMember regular_staff_1 = new StaffMember("John", "Brown", DeptNumbers.REG0463, 43) {
           @Override
           protected double calculateSalary() {
               return 0;
           }
       };
        regular_staff_1.display();

        System.out.println("\n\n\n");

        /*
         * QUESTION 4. Creating a List of Sales Representatives (4 Marks)
         * o Declare an ArrayList to store five SalesRep objects.
         * o Populate the list with five SalesRep instances.
         */
        ArrayList<SalesRep> salesReps = buildSalesRepArrayList();
        /*
         * QUESTION 5. Displaying Sales Representatives (6 Marks)
         * o Iterate through the ArrayList and invoke the display() method for each SalesRep
         * object.
         */
        for(SalesRep rep : salesReps){
            System.out.println();
            rep.display();
        }
        System.out.println("\n\n\n");

        /*
         * QUESTION 7. Implementing an Abstract Salary Calculation Method (10 Marks)
         * o Declare an abstract method named calculateSalary() in the StaffMember class that
         * returns a double.
         * o Implement the calculateSalary() method in each subclass to compute and display
         * salaries based on the following formulas:
         * ▪ Manager Salary = (hoursWorked * 2500) + bonus
         * ▪ SalesRep Salary = (hoursWorked * 1500) + allowance
         * o Since abstract methods require the class to be abstract, the StaffMember class must be
         * marked as abstract.
         */
        Manager manager_1 = new Manager("Dwight",
                "Thorpe",
                DeptNumbers.ICT645,
                63.5,
                120000 );
        SalesRep salesRep_1 = new SalesRep("Patrick", "Tate", DeptNumbers.SAL546, 45.89, 75000);

        System.out.println("\n\n\n");

        /**
         * QUESTION 6. Demonstrating Polymorphism (4 Marks)
         * o Override the display() method in both the Manager and SalesRep subclasses to display
         * additional attributes specific to each subclass.
         * o Demonstrate polymorphism within the Payroll class by calling the overridden display()
         * methods.
         */
        manager_1.display();
        System.out.println();
        salesRep_1.display();


        System.out.println("\n\n\n");



        /*
         * QUESTION 8. Displaying Salaries (4 Marks)
         * o In the Payroll class, instantiate objects of Manager and SalesRep.
         * o Call the calculateSalary() method for each and display the computed salary.
         */


        System.out.println("Salary for Manager $" + manager_1.calculateSalary());
        System.out.println("Salary for Sales Representative $" + salesRep_1.calculateSalary());


        System.out.println("\n\n\n");

        /*
         * QUESTION 9. Generate Paystubs
         * o Generate a paystub file that will show salary information for each employee on the Payroll.
         */
        PayStubPrintOut.generateManagerPayStub(manager_1); // 1 Manage are a time.
        PayStubPrintOut.generateSalesRepPayStub(salesReps); // ArrayList of Sale's Rep.
    }

    public static ArrayList<SalesRep> buildSalesRepArrayList(){
        ArrayList<SalesRep> arrayListOfSalesRep = new ArrayList<>();
        arrayListOfSalesRep.add(new SalesRep(
                "Sandy", "Jones", DeptNumbers.SAL546, 37.2, 23000
        ));
        arrayListOfSalesRep.add(new SalesRep(
                "Annakay", "Simpson", DeptNumbers.SAL546, 33.5, 21000
        ));
        arrayListOfSalesRep.add(new SalesRep(
                "Simon", "Sayas", DeptNumbers.SAL546, 43.34, 28000
        ));
        arrayListOfSalesRep.add(new SalesRep(
                "Onika", "Walker", DeptNumbers.SAL546, 47, 32800
        ));
        arrayListOfSalesRep.add(new SalesRep(
                "Jermain", "Campbell", DeptNumbers.SAL546, 40.2, 23000
        ));

        return arrayListOfSalesRep;
    }


}

