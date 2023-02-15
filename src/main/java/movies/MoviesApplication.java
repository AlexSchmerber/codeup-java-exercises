package movies;
import util.Input;

import java.util.Arrays;


import static movies.MoviesArray.findAll;


public class MoviesApplication {
    private static Movie [] addMovie(Movie [] array, String movieName, String movieDescription){
        Movie [] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = new Movie(movieName, movieDescription);
        return newArray;
    }
    private static void sortFunction(Movie []array, String sortQuality){
        for (Movie movie: array) {
            if(sortQuality.equals(movie.getCategory())){
                System.out.print(movie + " ");
            }
        }
    }
    private static Input userInput = new Input();
    public static void main(String[] args) {
        System.out.println("""
                What would you like to do?

                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category""");
        int userResponse = userInput.getInt(0, 5);
        Movie [] movieArray = findAll();

        switch (userResponse) {
            case 1 -> System.out.println(Arrays.toString(movieArray));
            case 2 -> {
                System.out.println("animated");
                sortFunction(movieArray, "animated");
            }
            case 3 -> {
                System.out.println("drama");
                sortFunction(movieArray, "drama");
            }
            case 4 -> {
                System.out.println("horror");
                sortFunction(movieArray, "horror");
            }
            case 5 -> {
                System.out.println("sci-fi");
                sortFunction(movieArray, "scifi");
            }
        }

        //add movie
//        movieArray = addMovie(movieArray, "Alex", "R");
//        System.out.println(movieArray[movieArray.length - 1]);
//        userInput.sc.close();
    }
}
