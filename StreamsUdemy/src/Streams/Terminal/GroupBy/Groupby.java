package Streams.Terminal.GroupBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class Groupby {
	
	public static void main(String[] args) {
		
		//System.out.println("grouping is done : "+getgrp());
		
		CustomixedGrpby();
		
	}
	
	public static Map<Integer,List<Student>> getgrp()
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
		
		//return aList.stream().collect(Collectors.groupingBy((s)->s.getIdInteger()));
		return aList.stream().collect(Collectors.groupingBy(Student::getIdInteger));
	}
	
	
	public static void CustomixedGrpby() 
	{
		List<Student> aList = new ArrayList<Student>();

		Student student1 = new Student("Saswata", 111, 56);
		aList.add(student1);

		Student student2 = new Student("Sikay", 111, 87);
		aList.add(student2); 

		Student student3 = new Student("Pakhi", 333, 99);
		aList.add(student3);

		Student student4 = new Student("Nila", 333, 76);
		aList.add(student4);

		Student student5 = new Student("Me", 555, 81);
		aList.add(student5);
		
		//Function<Student,String>function=(stud)->stud.getGradeInteger()>80?"Outstanding":"Average";
		
		Function<Student,String>function=(student)->student.
				getGradeInteger()>80?"Passed":"Failed";
		
		System.out.println("The Division is : "+aList.stream().collect(Collectors.groupingBy(function)));
		
		System.out.println("The Grouping by using a field : "+aList.stream().
				collect(Collectors.groupingBy(Student::getGradeInteger)));
	}

}
