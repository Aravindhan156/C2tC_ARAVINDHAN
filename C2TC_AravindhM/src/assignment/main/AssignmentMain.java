package assignment.main;

import assignment.employees.Developer;
import assignment.employees.Manager;
import assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Manager manager = new Manager("John", 101, 90000, "Sales"); 
	        Developer developer = new Developer("Alice", 102, 80000, "Java"); 
	        EmployeeUtilities.printEmployeeDetails(manager); 
	        EmployeeUtilities.printEmployeeDetails(developer);
	}

}
