package Streams.Terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class Joining {

	
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
		
		System.out.println("In the main method itself : "+aList.stream().map(Student::getName).
				collect(Collectors.joining("-","{{[[","]]}}")));
		
		
		//with our using Join.
		//System.out.println("With out Using Joining : "+aList.stream().map(Student::getName).forEach((a)->a+""));
		
		System.out.println("Joined_1 name is :"+getJoingiString(aList));
		
		System.out.println("Joined_2 name is :"+getJoingiString2(aList));
		
		System.out.println("Joined_3 name is :"+getJoingiString3(aList));
	}
	
	
	static String getJoingiString(List<Student>student) 
	{
		 return student.stream().
		map(Student::getName).collect(Collectors.joining());
	}
	
	static String getJoingiString2(List<Student>student) 
	{
		 return student.stream().
		map(Student::getName).collect(Collectors.joining("-"));
	}
	
	static String getJoingiString3(List<Student>student) 
	{
		 return student.stream().
		map(Student::getName).collect(Collectors.joining("-","(",")"));
	}
}
