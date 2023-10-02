package FunctionalInterface.Comparable;

public class EmployeeComparable  implements Comparable<EmployeeComparable>{

	private String nameString;

	private String phString;

	private int empId;



	public EmployeeComparable(String nameString, String phString, int empId) {
		super();
		this.nameString = nameString;
		this.phString = phString;
		this.empId = empId;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getPhString() {
		return phString;
	}

	public void setPhString(String phString) {
		this.phString = phString;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [nameString=" + nameString + ", phString=" + phString + ", empId=" + empId + "]";
	}

	@Override
	public int compareTo(EmployeeComparable o) {
		// TODO Auto-generated method stub
		return this.getEmpId()-o.getEmpId();
	}
}
