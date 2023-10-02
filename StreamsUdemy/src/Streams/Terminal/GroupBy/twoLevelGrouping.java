package Streams.Terminal.GroupBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class twoLevelGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getMap();
		getMap_2();

	}

	
	public static void getMap() 
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
		
		Function<Student,String>function=(stud)->stud.getGradeInteger()>80?"Outstanding":"Excellent";
		
		Map<Integer,Map<String,List<Student>>> map= 
				aList.stream().collect(Collectors.groupingBy(Student::getIdInteger,
				Collectors.groupingBy(function)));
		
		System.out.println("The second level division : "+map);
	}
	
	
	public static void getMap_2() 
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
		
		Map<String,Integer> maplistMap= aList.stream().collect(Collectors.groupingBy(Student::getName,
				Collectors.summingInt(Student::getGradeInteger)));
		
		System.out.println("The Map List is : "+maplistMap);
	}
}
