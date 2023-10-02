package Streams.Terminal.GroupBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class GroupbyMaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//grpmin();
		
		grpmax();
		
		//usecollect();
		

	}
	
	public static void grpmax() 
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

		Map<Integer,Optional<Student>> mapvalueMap= aList.stream().
				collect(Collectors.groupingBy(Student::getIdInteger,
				(Collectors.maxBy(Comparator.comparing(Student::getGradeInteger)))));
		
		System.out.println("Map by and Groping tpgther : "+mapvalueMap);
	}

	
	public static void grpmin() 
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

		Map<Integer,Integer> map=aList.stream().collect(Collectors.groupingBy(Student::getIdInteger,
				Collectors.summingInt(Student::getGradeInteger)));
		
//		Map<Integer,Optional<Student>> mapvalueMap= aList.stream().collect(Collectors.groupingBy(Student::getIdInteger,
//				(Collectors.minBy(Comparator.comparing(Student::getGradeInteger)))));
//		
//		
//		Map<Integer,Optional<Student>> map= aList.stream().collect(Collectors.groupingBy(Student::getIdInteger,
//				Collectors.maxBy(Comparator.comparing(Student::getGradeInteger))));
		
		
		
		
		System.out.println("Minby  by and Groping tpgther : "+map);
	}
	
	public static void  usecollect() 
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
		
		Map<Integer,Student>map=  aList.stream().collect(Collectors.groupingBy(Student::getIdInteger,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGradeInteger)),Optional::get)));
		
		System.out.println("Using Collecting and Then : "+map);
	}
}
