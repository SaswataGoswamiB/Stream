package Interface8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import FunctionalInterface.Entity.Student;

public class SortNullValue {
	
	public static Consumer<Student>consumer=(a)->System.out.println(a);
	
	public static void main(String[] args) {
		
		List<Student>aList=getStudentListDb();
		
		System.out.print("Witohut Sorting he null value : "+aList);
		//sortnullfirst(aList);
		sortnulllast(aList);
		
	}
	
	private static void sortnullfirst(List<Student> aList) {
		// TODO Auto-generated method stub
		Comparator<Student>comparatornameComparator=Comparator.comparing(Student::getName);
		Comparator<Student>nullComparator=Comparator.nullsFirst(comparatornameComparator);
		aList.sort(nullComparator);
		aList.forEach(consumer);
	}
	
	private static void sortnulllast(List<Student> aList) {
		// TODO Auto-generated method stub
		Comparator<Student>comparatornameComparator=Comparator.comparing(Student::getName);
		Comparator<Student>nullComparator=Comparator.nullsLast(comparatornameComparator);
		aList.sort(nullComparator);
		aList.forEach(consumer);
	}

	public static List<Student> getStudentListDb() 
	{
		List<Student> aList = new ArrayList<Student>();
		Student student1 = new Student("Rohit", 111, 56);
		aList.add(student1);

		Student student2 = new Student("Rahul", 222, 87);
		aList.add(student2);

		Student student3 = new Student("Gill", 333, 99);
		aList.add(student3);

		Student student4 = new Student("Virat", 444, 76);
		aList.add(student4);

		Student student5 = new Student("Iyer", 555, 81);
		aList.add(student5);
		
		Student student6 = null;
		aList.add(student6);
		
		
		return aList;

}
	
}
