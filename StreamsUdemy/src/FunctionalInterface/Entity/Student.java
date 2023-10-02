package FunctionalInterface.Entity;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;

	private Integer idInteger;

	private Integer gradeInteger;

	public List<Student> aList = new ArrayList<Student>();

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Integer idInteger, Integer gradeInteger) {
		super();
		this.name = name;
		this.idInteger = idInteger;
		this.gradeInteger = gradeInteger;

	}

	public List<Student> getList() {

		List<Student> alist = new ArrayList<Student>();

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public Integer getGradeInteger() {
		return gradeInteger;
	}

	public void setGradeInteger(Integer gradeInteger) {
		this.gradeInteger = gradeInteger;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", idInteger=" + idInteger + ", gradeInteger=" + gradeInteger + "]";
	}

}
