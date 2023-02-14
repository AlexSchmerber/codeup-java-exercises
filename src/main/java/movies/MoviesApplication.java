package movies;
import util.Input;

import java.util.Arrays;


import static movies.MoviesArray.findAll;

public class MoviesApplication {
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
        int increment = 0;
        System.out.println(Arrays.toString(movieArray));

        switch (userResponse) {
            case 1:
                System.out.println(Arrays.toString(movieArray));
                break;
            case 2:
                System.out.println("animated");
                for (Movie movie: movieArray) {
                    if("animated".equals(movie.getCategory())){
                        System.out.println(movie);
                    }
                }
                break;
            case 3:

                System.out.println("drama");
                break;
            case 4:

                System.out.println("horror");
                break;
            case 5:

                System.out.println("sci-fi");
                break;
        }
        userInput.sc.close();
    }
}
