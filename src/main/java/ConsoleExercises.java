import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: %.2f\n", pi);
//        System.out.format("The value of pi is approximately: %.2f\n", pi);

        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner("4ouch5");
//        scanner.useDelimiter('ouch')

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

        System.out.println("Enter an the length of a rectangular prism: ");
        String userWidth = scanner.nextLine();
        System.out.println("Enter an the width of a rectangular prism: ");
        String userLength = scanner.nextLine();
        System.out.println("Enter an the height of a rectangular prism: ");
        String userHeight = scanner.nextLine();
        int perimeter = Integer.parseInt(userWidth) * 2 + Integer.parseInt(userLength) * 2;
        int area = Integer.parseInt(userWidth) * Integer.parseInt(userLength);
        int volume = Integer.parseInt(userWidth) * Integer.parseInt(userLength) * Integer.parseInt(userHeight);
        System.out.printf("""
                The perimeter is %d
                The area is %d
                The volume is %d%n""", perimeter, area, volume);
        scanner.close();
    }
}
