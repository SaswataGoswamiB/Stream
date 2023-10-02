package Interface8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import FunctionalInterface.Entity.Student;

public class CompChaining {
	
	public static Consumer<Student> consumer=(stu)->System.out.println(stu);
	public static Comparator<Student>comparatornameComparator=Comparator.comparing(Student::getName);
	public static Comparator<Student>gradeComparator=Comparator.comparing(Student::getGradeInteger);
	
	public static void main(String[] args) {
		
		List<Student>studentliStudents=getStudentListDb();
		//sortbyName(studentliStudents);
		//sortbyGrade(studentliStudents);
		comapratorchainign(studentliStudents);
	}
	
	
	private static void comapratorchainign(List<Student> studentliStudents) {
		// TODO Auto-generated method stub
		
		studentliStudents.sort(gradeComparator.thenComparing(comparatornameComparator));
		studentliStudents.forEach(consumer);
	}


	public static void sortbyName(List<Student> studentliStudents) {
		// TODO Auto-generated method stub
		
		studentliStudents.sort(Comparator.comparing(Student::getName));
		studentliStudents.forEach(consumer);
	}
	
	public static void sortbyGrade(List<Student> studentliStudents) {
		// TODO Auto-generated method stub
		
		studentliStudents.sort(Comparator.comparing(Student::getGradeInteger));
		studentliStudents.forEach(consumer);
	}


	public static List<Student> getStudentListDb() 
	{
		List<Student> aList = new ArrayList<Student>();

		Student student1 = new Student("Rohit", 111, 56);
		aList.add(student1);

		Student student2 = new Student("Rahul", 222, 87);
		aList.add(student2);

		Student student3 = new Student("Gill", 333, 99);
		aList.add(student3);

		Student student4 = new Student("Virat", 444, 87);
		aList.add(student4);

		Student student5 = new Student("Iyer", 555, 56);
		aList.add(student5);
		
		return aList;
	}

}
