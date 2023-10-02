package FunctionalInterface.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import FunctionalInterface.Entity.Student;

public class ComparableImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmployeeComparable> aList = new ArrayList<EmployeeComparable>();

		aList.add(new EmployeeComparable("A", "125", 6));
		aList.add(new EmployeeComparable("B", "126", 1));
		aList.add(new EmployeeComparable("C", "129", 3));

		Collections.sort(aList);

		System.out.println(aList);

	}

}
