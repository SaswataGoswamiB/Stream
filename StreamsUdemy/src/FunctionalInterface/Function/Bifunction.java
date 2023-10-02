package FunctionalInterface.Function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import FunctionalInterface.Entity.Student;

public class Bifunction {

	static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	static Predicate<Student> p1 = (studa) -> studa.getGradeInteger() > 80;



	static BiFunction<List<Student>, Predicate<Student>, Map<String, Integer>> func4 = (stu, predicatee) -> 
	{
		stu.forEach(stud->
		{
			if(predicatee.test(stud)) 
			{
				hashMap.put(stud.getName(),stud.getIdInteger());
			}
		}
				);
		
		return hashMap;
		
	};
	public static void main(String[] args) {
		
		System.out.println("The valie is :"+func4.apply(new Student().getList(),p1));

	}

}
