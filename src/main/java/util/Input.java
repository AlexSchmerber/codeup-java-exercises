package util;
import java.util.Scanner;
public class Input {
    private Scanner sc;
    public Input() {
        this.sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.println(myInput.getString());
        System.out.println(myInput.yesNo());
        System.out.println(myInput.getInt(1, 10));
        System.out.println(myInput.getDouble(1.0, 1000.0));

    }
    public String getString() {
        return this.sc.nextLine();
    }
    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }
    public boolean yesNo(){
        String input = getString();
        return "y".equalsIgnoreCase(input) || "yes".equalsIgnoreCase(input);
    }

    public boolean yesNo(String prompt){
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt(){
        return sc.nextInt();
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int input = getInt();
        if(input > max || input < min){
            System.out.println("invalid number");
            return getInt(min, max);
        }
        return input;
    }

    public double getDouble(){
        return sc.nextDouble();
    }

    public double getDouble(Double min, Double max){
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double input = getDouble();
        if(input > max || input < min){
            System.out.println("invalid number");
            return getDouble(min, max);
        }
        return input;
    }


}
