package FunctionalInterface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Comparablec {

	public static void main(String args[])

	{
		List<EmployeeComparator> aList = new ArrayList<EmployeeComparator>();

		aList.add(new EmployeeComparator("Rohit", "125", 6));
		aList.add(new EmployeeComparator("Kohli", "126", 1));
		aList.add(new EmployeeComparator("Rahul", "129", 3));
		
		//Collections.sort(aList,new IdComaparator());
		aList.sort(new IdComaparator());
		
		System.out.println("The List is "+aList);

	}

}
