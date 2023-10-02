package Optional;

import java.util.Optional;

public class OptionalFlatMap {
	
	public static void main(String[] args) {
		
		optionalflamap();
	}
	
	public static void optionalflamap() 
	{
		Optional<StudentOptionalBike>optionalbikeOptional= 
				Optional.ofNullable(Optionale.getstudentBike());
		
		optionalbikeOptional.
		filter(x->x.getGradeInteger()>45).//returns ----->Optional<StudentOptionalBike>
		flatMap(StudentOptionalBike::getBikeOptional).//returns ----->optional<Bike>
		map(Bike::getNameString).// optional<String>
		ifPresent(x->System.out.println("The name pf the bike is : "+x));
	}

}
