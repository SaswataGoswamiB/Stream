package FunctionalInterface.Supplier;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> supplier=new SupplierDemo();
		System.out.println(supplier.get());

	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hi";
	}

}
