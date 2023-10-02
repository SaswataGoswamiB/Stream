package Optional;

import java.util.List;
import java.util.Optional;

import FunctionalInterface.Entity.Student;

public class OptionalMapFlatMapExample {

	
	//filter
//	public static void optionalFilterList() 
//	{
//		
//		Optional<List<Student>>optionalistOptional= Optional.ofNullable(Optionale.getStudentDb());
//		
//		optionalistOptional.stream().forEach();
//	}
	
	public static void OptionalStudentFilter() 
	{
		
		Optional<Student>optionalstuOptional=Optional.ofNullable(Optionale.getStudentDb());
		
		optionalstuOptional.
		filter(a->a.getGradeInteger()>50).
		ifPresent(x->System.out.println("Upgraded grade for :"+x.getName()+" "+"is : 100"));
	}
	//map
	
	public static void optionalmap() 
	{
		Optional<Student>optionalStudOptional=Optional.ofNullable(Optionale.getStudentDb());
		
		 Optional<String>optionalstringOptional= optionalStudOptional.
				 filter(a->a.getGradeInteger()>55).
				 map(Student::getName);
		 
		 System.out.println("Optional value using MAp : "+optionalstringOptional.get());
	}
	
	public static void optionalList() 
	{
		Optional<Student>optionalStudOptional=Optional.ofNullable(Optionale.getStudentDb());
		
		Optional<Student>studentOptionalfromdb=optionalStudOptional.filter(a->a.getGradeInteger()>55);
		
		Student studq1=studentOptionalfromdb.get();
		
		System.out.println("The List of Students is :"+studq1);
		
	}
	//flatmap
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//optionalFilter();
		//OptionalStudentFilter();
		//optionalmap();
		optionalList();

	}

}
