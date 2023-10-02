package Streams.Terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class SumandAvergae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		System.out.println("Using SummingInteger : "+sum(aList));
		
		System.out.println("The average is : "+average(aList));
	}
	
	public static int sum(List<Student>list) 
	{
		return  list.stream().collect(Collectors.summingInt(Student::getGradeInteger));
	}
	
	public static double average(List<Student>list) 
	{
		return list.stream().collect(Collectors.averagingInt(Student::getGradeInteger));
		
		//return list.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGradeInteger)));
	}

}
