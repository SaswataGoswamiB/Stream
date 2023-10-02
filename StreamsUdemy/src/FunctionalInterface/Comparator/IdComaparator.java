package FunctionalInterface.Comparator;

import java.util.Comparator;

public class IdComaparator implements Comparator<EmployeeComparator> {

	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}

}