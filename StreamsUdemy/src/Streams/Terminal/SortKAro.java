package Streams.Terminal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class SortKAro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Soted is : "+getmax());
		
		System.out.println("The sorting using Comapring :"+getmaxbyComparing());

	}
	
	public static Student getmax()
	{
		Comparator<Student> comparator=(a,b)->b.getGradeInteger().compareTo(a.getGradeInteger());
		
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
		
		return aList.stream().sorted(comparator).findFirst().get();
	}
	
	public static Student getmaxbyComparing() 
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
		
		return aList.stream().sorted(Comparator.comparing(Student::getGradeInteger)).findAny().get();
	}

}
