import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        int i = 100;
//        do {
//            if(i % 5 == 0){
//                System.out.println(i);
//            }
//            i--;
//        } while (i >= -10);

//        int i = 1;
//        while(i <= 100){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        }
//        System.out.print("Enter a integer: ");
//        int userInteger = input.nextInt();
//        String table = """
//                Here is your table!
//                number | squared | cubed
//                -------|---------|------
//                """;
//        double i = 1;
//        while(userInteger >= i){
//            double squared = i * i;
//            double cubed = i * i * i;
//            table += String.format("%s     |%s     |%s\n",i, squared, cubed);
//            i++;
//        }
//        System.out.printf("%s", table);
        int loop = 0;
        do {
            System.out.println("Enter a numerical grade from 0 to 100: ");
            String grade = input.nextLine();
            int numberGrade = Integer.parseInt(grade);
            if (numberGrade > 100 || numberGrade < 0){
                continue;
            }
            System.out.println("Your grade is: " + grade);
            System.out.println("Continue?");
            String response = input.nextLine();
            if(response.equalsIgnoreCase("yes")){
                System.out.print("Your grade is a: ");
                if(numberGrade <= 59){
                    System.out.println('F');
                } else if(numberGrade <= 66){
                    System.out.println('D');
                } else if(numberGrade <= 79){
                    System.out.println('C');
                } else if(numberGrade <= 87){
                    System.out.println('B');
                } else if(numberGrade <= 98){
                    System.out.println('A');
                } else{
                    System.out.println("A+");
                }
                loop += 1;
            }

        } while(loop == 0);
//        System.out.printf()
        input.close();
    }
}
