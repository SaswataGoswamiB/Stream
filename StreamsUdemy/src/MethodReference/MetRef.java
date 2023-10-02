package MethodReference;

import java.util.function.Function;

public class MetRef {
	
	public static void main(String[] args) {
		
		Function<String,String>function=(a)->a.toUpperCase();
		
		
		Function<String,String>functionReference=String::toUpperCase;
		
		System.out.println("The value of the Lambda Function is : "+function.apply("Saswata"));
		System.out.println("The function using Method Reference : "+functionReference.apply("Saswata"));
		
		
	}

}
