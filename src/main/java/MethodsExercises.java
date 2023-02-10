import java.util.Scanner;
public class MethodsExercises {
    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    private static int add(int num1, int num2) {
        return num1 + num2;
    }
    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
    private static int multiply(int num1, int num2) {
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }
    private static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    private static int getInteger(int min, int max, Scanner input){
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int number = input.nextInt();
        if(number < min || number > max){
            return getInteger(min, max, input);
        }
        return number;
    }

    private static long getFactorial(long num, Scanner input) {
        String compiledNums = "";
        long product = 1;
        for (int i = 1; i <= num; i++) {
            compiledNums += i + " x ";
            product *= i;
            System.out.printf(i + "! = %-15s = %d\n", compiledNums.substring(0, compiledNums.length() - 2), product);
        }
        return num;
    }

    public static void main(String[] args) {
//        System.out.println(subtract(5, 2));
//        System.out.println(add(5, 2));
//        System.out.println(divide(5, 2));
//        System.out.println(multiply(5, 2));
//        System.out.println(modulus(5, 2));
        Scanner input = new Scanner(System.in);
//        getInteger(1, 10, input);

//        long userNumber;
//        String continueResponse = null;
//        do {
//            System.out.print("Enter a number between 1 and 10: ");
//            userNumber = input.nextLong();
//            if (userNumber > 10 || userNumber < 1){
//                continue;
//            }
//            System.out.printf("You entered: %d\n", userNumber);
//            input.nextLine();
//            System.out.println("Continue? [y/n]");
//            continueResponse = input.nextLine();
//        } while (!"y".equalsIgnoreCase(continueResponse));
//        getFactorial(userNumber, input);

        System.out.println("Enter a number for the sides of a pair of dice: ");
        int sides = input.nextInt();
        rollDice(sides);
        input.close();
    }

    public static long rollDice(int sides) {
        int roll1 = (int) (Math.random() * sides) + 1;
        int roll2 = (int) (Math.random() * sides) + 1;
        long sumRoll = roll1 + roll2;
        System.out.printf("You rolled a %d and a %d\nTotal: %d", roll1, roll2, sumRoll);
        return sumRoll;
    }
}
