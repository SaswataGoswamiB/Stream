package FunctionalInterface.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import FunctionalInterface.Entity.Student;

public class ComaparatorExam {

	public static void main(String[] args) {

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
		Comparator<Student> comparator = (a, b) -> a.getIdInteger().compareTo(b.getGradeInteger());
		aList.sort(comparator);
		System.out.println("Sorting using Id : "+aList);

		Comparator<Integer> x = (a, b) -> a.compareTo(b);

		int a = 12;

		System.out.println("The Bigger value is " + x.compare(10, 11));

	}
}
