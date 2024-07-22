package FunctionalProgramming.ExampleMovie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepo {

    public static void main(String[] args) {

        List<Movie>listofMovie=getmovies();

        System.out.println("The List of Successfull Movies are : "+ 
        getfilteretdList((movie)->movie.getBudget()*2>movie.getBpxoffie()));;
        
    }

    static List<Movie> getmovies()
    {
        List<Movie>listmovie=new ArrayList<Movie>();
        listmovie.add(new Movie("ABC", 125, 245));
        listmovie.add(new Movie("RAone", 200, 400));
        listmovie.add(new Movie("Don", 40, 1000));
        listmovie.add(new Movie("Dhoom", 300, 20000));
        listmovie.add(new Movie("Mohenjodaro", 50, 200));

        return listmovie;
    }
    
    static List<Movie> getfilteretdList(FilteringMovie filkFilteringMovie)
    {
        List<Movie>allmovies=getmovies();
        List<Movie>filteredmovie=new ArrayList<>();
        for(Movie movie : allmovies)
        {
            if(filkFilteringMovie.testmovie(movie))
            {
                filteredmovie.add(movie);
            }
        }

        return filteredmovie;
    }
}
