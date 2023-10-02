package Streams.Terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class Partioningby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		part();

	}

	public static void part() {
		
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
		
		
		List<Student>finaList=aList.stream().filter(s->s.getGradeInteger()>80).collect(Collectors.toList());
		
		System.out.println("Not using the Partioning by method : "+finaList);

		Predicate<Student>predicate=(x)->x.getGradeInteger()>80;
		
		Map<Boolean,List<Student>> map= aList.stream().collect(Collectors.partitioningBy(predicate));
		
		System.out.println("Using partioning by : "+map);
	}

}
