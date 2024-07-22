package FunctionalProgramming.ExampeStudent;



public class Student {

    String id;

    String name;

    Integer Lpa;

    Integer allovermarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLpa() {
        return Lpa;
    }

    public void setLpa(Integer lpa) {
        Lpa = lpa;
    }

    public Integer getAllovermarks() {
        return allovermarks;
    }

    public void setAllovermarks(Integer allovermarks) {
        this.allovermarks = allovermarks;
    }

    public Student(String id, String name, Integer lpa, Integer allovermarks) {
        this.id = id;
        this.name = name;
        Lpa = lpa;
        this.allovermarks = allovermarks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", Lpa=" + Lpa + ", allovermarks=" + allovermarks + "]";
    }

    


    
}
