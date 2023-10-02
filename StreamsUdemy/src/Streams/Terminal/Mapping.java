package Streams.Terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class Mapping {
	
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
		
		List<String>aList2=aList.stream().map(Student::getName).collect(Collectors.toList());
		
		System.out.println("The List value using map is : "+aList2);
		
		
		
		List<String>aList3=aList.stream().collect(Collectors.mapping(Student::getName,Collectors.toList()));
		
		System.out.println(aList3);
		
		Set<String>aSet=aList.stream().collect(Collectors.mapping(Student::getName,Collectors.toSet()));
		
		System.out.println("The value is : "+aSet);
	}
	
	
	

}
