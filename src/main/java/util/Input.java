package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;
    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.println(myInput.getString());
        System.out.println(myInput.yesNo());
        System.out.println(myInput.getInt(1, 10));
        System.out.println(myInput.getDouble(1.0, 1000.0));

    }
    private String getString() {
        return this.scanner.nextLine();
    }
    private Boolean yesNo(){
        String input = this.scanner.nextLine();
        if ("y".equalsIgnoreCase(input) || "yes".equalsIgnoreCase(input)){
            return true;
        }else {
            return false;
        }
    }

    private int getInt(int min, int max){
        System.out.printf("Type number between %d and %d", min, max);
        scanner.next();
        int input = this.scanner.nextInt();
        if(input > max || input < min){
            System.out.println("invalid number");
            getInt(min, max);
        }
        return input;
    }
    private Double getDouble(Double min, Double max){
        System.out.printf("Type number between %d and %d", min, max);
        Double input = this.scanner.nextDouble();
        if(input > max || input < min){
            System.out.println("invalid number");
            getDouble(min, max);
        }
        return input;
    }


}
