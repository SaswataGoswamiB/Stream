package Optional;


public class Bike {
	
	String nameString;
	
	String modelString;

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getModelString() {
		return modelString;
	}

	public void setModelString(String modelString) {
		this.modelString = modelString;
	}

	public Bike(String nameString, String modelString) {
		super();
		this.nameString = nameString;
		this.modelString = modelString;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bike [nameString=" + nameString + ", modelString=" + modelString + "]";
	}
	
	

}
