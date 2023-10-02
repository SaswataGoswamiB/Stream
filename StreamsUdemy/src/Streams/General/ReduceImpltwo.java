package Streams.General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class ReduceImpltwo {

	public static void main(String[] args) {
		
		List<Integer>aaList=Arrays.asList(2,57,7,9,0);
		
		System.out.println("The max value is "+aaList.stream().reduce(Integer::max).get());
		
		System.out.println("The Max value is "+aaList.stream().reduce((a,b)->a>b?a:b).get());
		
		
		System.out.println("-------------------------------------------------------");
		

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
		
		//Reduce without Method Reference.
		System.out.println("The maximum grade is with "+
		aList.stream().reduce((a,b)->a.getGradeInteger()>b.getGradeInteger()?a:b).get());
		
		//Reduce with Method Reference.
		System.out.println("The maximum with Method Reference is "+aList.stream().
				map(a->a.getGradeInteger()).reduce(Integer::max).get());
		
		
		//Using Summing int.
		
		System.out.println("Sum Using Summing int is : "
		+aList.stream().collect(Collectors.summingInt(Student::getGradeInteger)));
		
	}
}
