package grocerylist;
import util.Input;
import java.util.HashMap;

public class GroceryApplication {

    static HashMap<String, Grocery> groceries = new HashMap<>();

    private static Input sc = new Input();

    private static boolean incomplete = true;

    private static String categoryOptions = """
                6. Other
                5. Pharmacy
                4. Grains & Wheat Products
                3. Eggs & Dairy Products
                2. Fish Products
                1. Meat Products
                Choose Category""";

    private static void enterItem() {
        String itemName = sc.getString("What is the name your new item:");
        System.out.println(categoryOptions);
        String category = null;
        int categoryNum = sc.getInt(1, 6);
        Input.sc.nextLine();
        switch (categoryNum){
            case 1 -> category = "Meat";
            case 2 -> category = "Fish";
            case 3 -> category = "Eggs & Dairy";
            case 4 -> category = "Grains & Wheat";
            case 5 -> category = "Pharmacy";
            case 6 -> category = "Other";
        }
        int quantity = Integer.parseInt(sc.getString("Enter quantity of item"));
        Grocery item = new Grocery(itemName, category, quantity);
        System.out.println(item);
        incomplete = false;
        // change finalize to false;
    }

    public static void main(String[] args) {
        String userResponse = sc.getString("Would you like to create a grocery list (y/n)?");
        if("y".equalsIgnoreCase(userResponse)){
            while(incomplete){
                enterItem();
                String continueResponse = sc.getString("Would you like to add another item (y/n)?");
                if(!"y".equalsIgnoreCase(continueResponse)){
                    incomplete = false;
                }
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
