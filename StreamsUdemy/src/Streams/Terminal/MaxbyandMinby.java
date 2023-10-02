package Streams.Terminal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class MaxbyandMinby {
	
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
		
		
		Comparator<Student>comaComparator=(a,b)->a.getIdInteger().compareTo(b.getIdInteger());
		
		System.out.println("Max by not using Comparing : "+
		aList.stream().collect(Collectors.maxBy(comaComparator)).get());
		
		
		System.out.println("Student with Max g"+
		aList.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getIdInteger))).get());
		
		
		System.out.println("Student with Min g"+
				aList.stream().collect(Collectors.minBy(Comparator.comparing(Student::getIdInteger))).get());
		
		
	}
}
