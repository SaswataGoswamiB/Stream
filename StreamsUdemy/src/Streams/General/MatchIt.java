package Streams.General;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import FunctionalInterface.Entity.Student;

public class MatchIt {
	
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
		
		
		//Predicate to be used in the matches.
		Predicate<Student>predicate=(s)->s.getGradeInteger()==81;
		
		Predicate<Student> predicatetowPredicate=(s)->s.getGradeInteger()>90;
		
		//all match 
		
		boolean b1=aList.stream().allMatch(predicate);
		
		System.out.println("All matches to 81 : "+b1);
		
		//any match
		
		boolean b2=aList.stream().anyMatch(predicate);
		
		System.out.println("Any  matches to 81 : "+b2);
		
		//noMAtch
		
		boolean b3=aList.stream().noneMatch(predicate);
		
		System.out.println("No match to 81 : "+b3);
		
		
		
		
	}

}
