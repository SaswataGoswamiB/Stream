package FunctionalInterface.Function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import FunctionalInterface.Entity.Student;

//Functional interface is used to convert one typeof Object to other type.
public class FunctionalInter {

	static Function<String, String> function = (name) -> name.toUpperCase();

	static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

	static Function<String, String> function2 = (name) -> name.concat("Goswami");

	;

	static Function<List<Student>, Map<String, Integer>> function3 = (student) -> {

		student.forEach(stu -> hashMap.put(stu.getName(), stu.getIdInteger()));
		// System.out.println(student.get(0));
		return hashMap;

	};

	public static void main(String[] args) {

		System.out.println("The Functon is : " + function.apply("Saswata"));

		// amd Then follows the normal patterns that is function is applied first and
		// then function2.

		System.out.println("The One way is " + function.andThen(function2).apply("Saswata"));

		// But for compose function2 is applied first that makes Saswata as
		// SaswataGoswami
		// and then on top of it function2 is applied which makes
		// SaswataGoswami---->SASWATAGOSWAMI.

		System.out.println("The Compose is " + function.compose(function2).apply("Saswata"));

		// System.out.println(new Student().getList());

		System.out.println("The mapped value of the Students is " + function3.apply(new Student().aList));

	}

}
