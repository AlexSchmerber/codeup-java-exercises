import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: %.2f\n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInteger = scanner.nextInt();
        System.out.printf("You entered: --> %d\n", userInteger);
        scanner.nextLine();

        System.out.println("Enter three words: ");
        String userWord1 = scanner.next();
        String userWord2 = scanner.next();
        String userWord3 = scanner.next();
        System.out.printf("You entered: --> %s %s %s\n", userWord1, userWord2, userWord3);
        scanner.nextLine();

        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.printf("You entered: --> %s\n", userSentence);
        scanner.nextLine();

        System.out.println("Enter an the length of a rectangle: ");
        int userWidth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter an the width of a rectangle: ");
        int userLength = scanner.nextInt();
        int perimeter = userWidth * 2 + userLength * 2;
        System.out.printf("The perimeter of the rectangle is: --> %d\n", perimeter);
        scanner.nextLine();
    }
}
