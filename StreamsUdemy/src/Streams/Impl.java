package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Impl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String>aList=Arrays.asList();
	
	
	System.out.println(aList==null);
	
	System.out.println(aList.isEmpty());
	
	
//	System.out.println("String : ");
//	
//	//System.out.println(string.isEmpty());
//	
//	System.out.println(string==null);
//	
//	System.out.println(string.isEmpty());
//	
//	System.out.println(Objects.isNull(string));
//	
//	//System.out.println(string.isEmpty()+"------"+string2==null);

	}

	
	public static Student getValue(int x) 
	{
		Student student=new Student();
		if(x==1) 
		{
			student.idString="123";
			student.nameString="Saswata";
		}
		 return student;
	}
}
