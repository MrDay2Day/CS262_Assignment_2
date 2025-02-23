/**
 * This package contains utility classes for payroll-related operations.
 */
package utils;

import StaffManagement.Manager;
import StaffManagement.SalesRep;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Utility class for generating pay stub printouts for managers and sales representatives.
 */
public class PayStubPrintOut {

    /**
     * Generates a pay stub for a manager and writes it to a file.
     *
     * @param manager The manager whose pay stub is to be generated.
     */
    public static void generateManagerPayStub(Manager manager) {
        try (FileWriter writer = new FileWriter("manager_paystub.txt")) {
            writer.write("Manager Payroll Summary\n");
            writer.write("\n-------------------\n\n");
            writer.write("Manager: " + manager.getFirstName() + " " + manager.getLastName() +  "\n" +
                    " - Salary: $" + manager.calculateSalary() + "\n" +
                    "\n");

            System.out.println("Manager Pay stub generated successfully.");
        } catch (Exception e) {
            System.out.println("Error writing Manager pay stub file.");
        }
    }

    /**
     * Generates pay stubs for a list of sales representatives and writes them to a file.
     *
     * @param salesReps The list of sales representatives whose pay stubs are to be generated.
     */
    public static void generateSalesRepPayStub(ArrayList<SalesRep> salesReps) {
        try (FileWriter writer = new FileWriter("salesrep_paystub.txt")) {
            writer.write("Sales Representative Payroll Summary\n");
            writer.write("\n-------------------\n\n");
            for (SalesRep sr : salesReps) {
                writer.write("Sales Representative: " + sr.getFirstName() + " " + sr.getLastName() +  "\n" +
                        " - Salary: $" + sr.calculateSalary() + "\n" +
                        "\n");
            }

            System.out.println("Sale's Representatives Pay stub generated successfully.");
        } catch (Exception e) {
            System.out.println("Error writing Sale's Representatives pay stub file.");
        }
    }
}
