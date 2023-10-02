package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentOptionalBike {
	

		private String name;

		private Integer idInteger;

		private Integer gradeInteger;
		
		private Optional<Bike> bikeOptional;
		//private Bike bikeOptional;


		public Optional<Bike> getBikeOptional() {
			return bikeOptional;
		}

		public void setBikeOptional(Optional<Bike> bikeOptional) {
			this.bikeOptional = bikeOptional;
		}

		public StudentOptionalBike(String name, Integer idInteger, Integer gradeInteger, Optional<Bike> bikeOptional) {
			super();
			this.name = name;
			this.idInteger = idInteger;
			this.gradeInteger = gradeInteger;
			this.bikeOptional = bikeOptional;
		}

		public StudentOptionalBike() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StudentOptionalBike(String name, Integer idInteger, Integer gradeInteger) {
			super();
			this.name = name;
			this.idInteger = idInteger;
			this.gradeInteger = gradeInteger;

		}

		public List<StudentOptionalBike> getList() {

			List<StudentOptionalBike> alist = new ArrayList<StudentOptionalBike>();

			StudentOptionalBike student1 = new StudentOptionalBike("Saswata", 111, 56);
			alist.add(student1);

			StudentOptionalBike student2 = new StudentOptionalBike("Sikay", 222, 87);
			alist.add(student2);

			StudentOptionalBike student3 = new StudentOptionalBike("Pakhi", 333, 99);
			alist.add(student3);

			StudentOptionalBike student4 = new StudentOptionalBike("Nila", 444, 76);
			alist.add(student4);

			StudentOptionalBike student5 = new StudentOptionalBike("Me", 555, 81);
			alist.add(student5);
			
			
			
			return alist;
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
			return "StudentOptionalBike [name=" + name + ", idInteger=" + idInteger + ", gradeInteger=" + gradeInteger
					+ ", bikeOptional=" + bikeOptional + "]";
		}

	}



