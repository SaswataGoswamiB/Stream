package FunctionalProgramming.ExampleMovie;

public class Movie {

    String name;

    int budget;

    int bpxoffie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBpxoffie() {
        return bpxoffie;
    }

    public void setBpxoffie(int bpxoffie) {
        this.bpxoffie = bpxoffie;
    }

    public Movie(String name, int budget, int bpxoffie) {
        this.name = name;
        this.budget = budget;
        this.bpxoffie = bpxoffie;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", budget=" + budget + ", bpxoffie=" + bpxoffie + "]";
    }

    
    
}
