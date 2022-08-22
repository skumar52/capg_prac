package day6;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1004, "Asha", "HR");
		Employee emp2 = new Employee(1004, "Krish", "HR");
		
//		System.out.println(emp1==emp2); //false - ref compa
//		System.out.println(emp1.equals(emp2));//false - ref comp
//		
//		System.out.println(emp1.hashCode()); //1365202186
//		System.out.println(emp2.hashCode()); //1651191114
//		
//		Set<Employee> employees = new HashSet<>();
//		employees.add(emp1);
//		employees.add(emp2);
//		
//		for(Employee emp: employees) {
//			System.out.println(emp); //Employee [empId=1004, empName=Krish, deptName=HR]
		                             //Employee [empId=1004, empName=Krish, deptName=HR]
//		}
		
		// After Overriding hashCode() and equals() method
		
		System.out.println(emp1==emp2); //false - ref compa
		System.out.println(emp1.equals(emp2));//true- content comp
		
		System.out.println(emp1.hashCode()); //75049492
		System.out.println(emp2.hashCode()); //75049492
		
		Set<Employee> employees = new HashSet<>();
		employees.add(emp1);
		employees.add(emp2);
		
		for(Employee emp: employees) {
			System.out.println(emp); //Employee [empId=1004, empName=Krish, deptName=HR]
		}
		
		
		
		
		
	}

}
