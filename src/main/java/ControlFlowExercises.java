public class ControlFlowExercises {
    public static void main(String[] args) {
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

        int i = 1;
        while(i <= 100){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }

    }
}
