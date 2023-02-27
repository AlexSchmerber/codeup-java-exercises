import org.apache.commons.lang3.StringUtils;
import util.Input;


public class MavenExercise {
    private static final Input sc = new Input();
    public static void main(String[] args) {

        String input = sc.getString("User input: \n");
        System.out.println("User input: " + input);
        System.out.println("Numeric status: " + StringUtils.isNumeric(input));
        System.out.println("Input case swapped: " + StringUtils.swapCase(input));
        System.out.println("Input reversed: " + StringUtils.reverse(input));
    }
}
