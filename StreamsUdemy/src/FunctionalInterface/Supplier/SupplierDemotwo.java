package FunctionalInterface.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemotwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<List<String>> supply=()->Arrays.asList("Saswata","Goswami");
		
		System.out.println(supply.get());
		
		

	}

}
