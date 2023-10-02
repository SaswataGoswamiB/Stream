package FunctionalInterface.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import FunctionalInterface.Entity.Student;

public class Comparing {

	public static void main(String[] args) {

		List<Student> aList = new ArrayList<Student>();
		List<Student> bList = new ArrayList<Student>();

		Student student1 = new Student("Rohit", 111, 56);
		aList.add(student1);
		bList.add(student1);

		Student student2 = new Student("Rahul", 222, 87);
		aList.add(student2);
		bList.add(student2);

		Student student3 = new Student("Gill", 333, 99);
		aList.add(student3);
		bList.add(student3);

		Student student4 = new Student("Virat", 444, 76);
		aList.add(student4);
		bList.add(student4);

		Student student5 = new Student("Iyer", 555, 81);
		aList.add(student5);
		bList.add(student5);

		Comparator<Student> cpomparator = Comparator.comparing(Student::getGradeInteger);
		aList.sort(cpomparator);
		System.out.println("Sorting using Comparing method :" + aList);

		Comparator<Student> comparatorcomaComparator = (a, b) -> a.getGradeInteger().compareTo(b.getGradeInteger());
		bList.sort(comparatorcomaComparator);
		System.out.println("Sorting Using Compare method : " + bList);
	}

}
