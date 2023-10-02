package FunctionalInterface.Predicate;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import FunctionalInterface.Entity.Student;

public class PredicateDemo2 {

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

		Consumer<Student> c1 = (studa) -> System.out.println("Name is : " + studa.getName());
		Consumer<Student> c2 = (studa) -> System.out.println("Id is : " + studa.getIdInteger());
		Consumer<Student> c3 = (studa) -> System.out.println("Grade is : " + studa.getGradeInteger());
		Predicate<Student> p1 = (studa) -> studa.getGradeInteger() > 80;

		Predicate<Student> p2 = (stud) -> stud.getIdInteger() > 250;

		BiPredicate<Student, Student> p3 = (studs, studsa) -> studs.getGradeInteger() > 80
				&& studsa.getIdInteger() < 250;
//		aList.stream().filter(p1).collect(Collectors.toList());

		aList.stream().forEach(student -> {

			if (p1.and(p2).test(student)) {
				c1.andThen(c2).andThen(c3).accept(student);
			}
		});
		
		
	

		aList.stream().forEach(s -> {
			if (p3.test(s, s)) {
				c1.andThen(c2).andThen(c3).accept(s);
			}
		});
	}

	

}