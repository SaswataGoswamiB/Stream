package FunctionalProgramming.ExampeStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    public static void main(String[] args) {
        
        List<Student>listfinal=getstudent();

        System.out.println("The Brilliant Students are using Anonymous Inner Class  :"+getfilteredstudent(new FilteringCondtion() {

            @Override
            public boolean test(Student student) {
                // TODO Auto-generated method stub
                return student.getAllovermarks()>90;
            }
            
        }));

        System.out.println("The Lambda marks are : "+getfilteredstudent((hotel)->hotel.getAllovermarks()<90));
        


        
    }

    public static List<Student> getfilteredstudent(FilteringCondtion filteringcondition)
    {
        List<Student>listfinal=getstudent();
        List<Student>filteredstudent=new ArrayList<>();
        for(Student onestud:listfinal){
            if(filteringcondition.test(onestud))
            {
                filteredstudent.add(onestud);
            }
        }

        return filteredstudent;
    }

    public static List<Student> getstudent()
    {
        List<Student>liststudent=new ArrayList<Student>();
        liststudent.add(new Student("12", "Saswata",4, 90));
        liststudent.add(new Student("13", "Arpita",5, 91));
        liststudent.add(new Student("13", "Rahul",6, 92));
        liststudent.add(new Student("14", "Saswata",7, 70));
        liststudent.add(new Student("15", "Saswata",8, 80));

        return liststudent;
    }


    // public static filtermethod(some condtion)
    // {
    //     if(some Conditon)
             
    //         return list;
    // }

    //


    //you can write differnt methods for filtering different values based on the input from the Students.

    // you can write one mthod , pass the condtion to it and and use that Condtion to extract the values.

    // method(Some Condtion){   use the COndtin {get the result}}
    
}
