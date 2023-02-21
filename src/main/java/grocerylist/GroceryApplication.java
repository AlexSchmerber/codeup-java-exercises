package grocerylist;
import util.Input;
import java.util.HashMap;

public class GroceryApplication {

    static HashMap<String, Grocery> groceries = new HashMap<>();

    private static final Input sc = new Input();

    private static boolean incomplete = true;

    private static String categoryOptions = """
                6. Other
                5. Pharmacy
                4. Grains & Wheat Products
                3. Eggs & Dairy Products
                2. Fish Products
                1. Meat Products
                Choose Category""";

    static String category = null;

    private static void categoryCases(int statement){
        switch (statement){
            case 1 -> category = "Meat";
            case 2 -> category = "Fish";
            case 3 -> category = "Eggs & Dairy";
            case 4 -> category = "Grains & Wheat";
            case 5 -> category = "Pharmacy";
            case 6 -> category = "Other";
        }
    }

    private static void enterItem() {
        String itemName = sc.getString("What is the name your new item:");
        System.out.println(categoryOptions);
        int categoryNum = sc.getInt(1, 6);
        Input.sc.nextLine();
        categoryCases(categoryNum);
        int quantity = Integer.parseInt(sc.getString("Enter quantity of item"));
        Grocery item = new Grocery(itemName, category, quantity);
        groceries.put(itemName.toUpperCase(), item);
        System.out.println("Item added:\n" + item);
        System.out.println("List: " + groceries);
    }

    public static void main(String[] args) {
        String userResponse = sc.getString("Would you like to create a grocery list (y/n)?");
        if("y".equalsIgnoreCase(userResponse)){
            while(incomplete){
                enterItem();
                String continueResponse = sc.getString("Would you like to add another item (y/n)?");
                if(!"y".equalsIgnoreCase(continueResponse)){
                    incomplete = false;
                    System.out.println(groceries);
                }
            }
        }
    }
}
