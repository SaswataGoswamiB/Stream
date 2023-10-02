package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import FunctionalInterface.Entity.Student;

public class Optionale {
	
	
	public static List<Student> getStudentListDb() 
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
		
		return aList;
	}
	

	public static Student getStudentDb() 
	{

		Student student1 = new Student("Saswata", 111, 56);
		return student1;
	}
	
	
	
	
	public static StudentOptionalBike getstudentBike() 
	{
		StudentOptionalBike student1 = new StudentOptionalBike("Saswata", 111, 56);
		Bike bike=new Bike();
		bike.setNameString("Hero");
		bike.setModelString("Xpulse");
		
		//student1.setBikeOptional(Optional.ofNullable(bike));
		student1.setBikeOptional(Optional.ofNullable(bike));
		
		return student1;
	}

}
