import java.util.Scanner;
public class HighLow {
    private static int randomNumber(){
        return (int) (Math.random() * 100) + 1;
    }
    public static void main(String[] args) {
        runGame();
    }

    private static void runGame() {
        Scanner input = new Scanner(System.in);
        int number = randomNumber();
        String playAgain;
        int guess;
        do {
            System.out.println("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            if(guess > number){
                System.out.println("Too high");
            }
            if(guess < number){
                System.out.println("Too low");
            }
        } while (guess != number);
        input.nextLine();
        System.out.println("You guessed it! Play again? [y/n]");
        playAgain = input.nextLine();
        if("y".equalsIgnoreCase(playAgain)){
            runGame();
        }
        input.close();
    }
}
