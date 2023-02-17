package grocerylist;
import util.Input;
import java.util.HashMap;

public class GroceryApplication {

    static HashMap<String, Grocery> groceries = new HashMap<>();

    private static Input sc = new Input();

    private static boolean finalize = true;

    private static void enterItem() {
        String user
    }

    public static void main(String[] args) {
        String userResponse = sc.getString("Would you like to create a grocery list (y/n)?");
        if("y".equalsIgnoreCase(userResponse)){
            while(finalize){
                enterItem();
            }
        }
    }
    // prompt y/n to create grocery list
    // if y ask y/n if they want to enter an item
    // if y prompt question
    // 1. Categories to choose items from 2. Enter name of item 3. Enter how many item
    // ask if list is final or if they want to add new item
    // once finalized, print list alphabetically in categories and including quantity.
    // bonuses


}
