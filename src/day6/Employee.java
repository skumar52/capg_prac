package day6;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	long empId;
	String empName;
	String deptName;
	
	
	// Constructors
	public Employee() {
		super();
	}

	public Employee(long empId, String empName, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}

	// Getters & Setters
	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

		
	@Override
	public int hashCode() {
		return Objects.hash(deptName, empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptName, other.deptName) && empId == other.empId
				&& Objects.equals(empName, other.empName);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + "]";
	}

	// Sort based on empName
	@Override
	public int compareTo(Employee o) {
		
		// sort in asc order
		//return this.getEmpName().compareTo(o.getEmpName());
		
		// sort in desc order
		return o.getEmpName().compareTo(this.getEmpName());
	}

	// Sort based on emp Id
//	@Override
//	public int compareTo(Employee o) {
//		if(this.getEmpId()>o.getEmpId()) {
//			return 1;
//		} else if(this.getEmpId()<o.getEmpId()) {
//			return -1;
//		} else {
//			return 0;
//		}
//		
//	}
	
	
	

}
