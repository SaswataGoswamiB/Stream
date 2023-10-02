package MethodReference;

import java.security.PublicKey;
import java.util.function.Predicate;
import java.util.function.Supplier;

import FunctionalInterface.Entity.Student;

public class LambdatoMethodRef {
	
	public static void main(String[] args) {
		
		Supplier<Student> studentSupplier=()->{
			
			return new Student("Saswata", 111, 56);
		};
		
		// Creating the Lambda
		
		//Predicate<Student> predicate=(x)->x.getGradeInteger()>150;
		
		
		//Changing the Lamda to Method Reference !!!!
		Predicate<Student> predicate=LambdatoMethodRef::testPredicate;
		
		
		//Predicate<Student>predicate=(a)->a.getGradeInteger()>3;
		
		
		System.out.println("Is this Eligible : "+predicate.test(studentSupplier.get()));
	}
	
	
	public static boolean testPredicate( Student s) {
		
		return s.getGradeInteger()>150;
	}

}
