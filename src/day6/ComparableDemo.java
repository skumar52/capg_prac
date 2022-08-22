package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparableDemo {
	

	
	

		public static <T> void main(String[] args) {
			
			Employee emp1 = new Employee(1001, "Ram", "IT");
			Employee emp2 = new Employee(1003, "Sam", "IT");
			Employee emp3 = new Employee(1002, "Ravi", "Admin");
			Employee emp4 = new Employee(1004, "Krish", "HR");
			Employee emp5 = new Employee(1004, "Dan", "HR");
			
			List<Employee> employees = new ArrayList<>();
			
			employees.add(emp1);
			employees.add(emp2);
			employees.add(emp3);
			employees.add(emp4);
			employees.add(emp5);
			
			// Before sorting
			System.out.println("Before Sorting: ");
			for(Employee emp:employees) {
				System.out.println(emp);
			}
			
			// Sorting
			Collections.sort(employees);
			
			
			System.out.println();
			System.out.println("After Sorting: ");
			for(Employee emp:employees) {
				System.out.println(emp);
			}
		}

	}
