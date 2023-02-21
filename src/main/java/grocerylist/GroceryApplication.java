package grocerylist;
import util.Input;

import java.util.*;

public class GroceryApplication {

    private static final Input sc = new Input();

    private static String categoryOptions = """
                6. Other
                5. Pharmacy
                4. Grains & Wheat Products
                3. Eggs & Dairy Products
                2. Fish Products
                1. Meat Products
                Choose Category""";

    static String CATEGORY = null;

    private static String categoryCases(int statement){
        switch (statement){
            case 1 -> CATEGORY = "Meat";
            case 2 -> CATEGORY = "Fish";
            case 3 -> CATEGORY = "Eggs & Dairy";
            case 4 -> CATEGORY = "Grains & Wheat";
            case 5 -> CATEGORY = "Pharmacy";
            case 6 -> CATEGORY = "Other";
        }
        return CATEGORY;
    }

    private static void enterItem(ArrayList<Grocery> myList) {
        String itemName = sc.getString("What is the name your new item:");
        System.out.println(categoryOptions);
        int categoryNum = sc.getInt(1, 6);
        Input.sc.nextLine();
        categoryCases(categoryNum);
        int quantity = Integer.parseInt(sc.getString("Enter quantity of item"));
        Grocery item = new Grocery(itemName, CATEGORY, quantity);
        myList.add(item);
        System.out.println("Item added:\n" + item);
        System.out.println("List: " + myList);
    }

    private static void printList(ArrayList<Grocery> myList){
        for (int i = 1; i <= 6; i++) {
            for (Grocery item : myList){
                if (categoryCases(i).equals(item.getCategory())) {
                    System.out.println(item);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Grocery> myList = new ArrayList<>();
        String userResponse = String.valueOf(sc.yesNo("Would you like to create a grocery list (y/n)?"));
        if("true".equalsIgnoreCase(userResponse)){
            while(true){
                enterItem(myList);
                String continueResponse = String.valueOf(sc.yesNo("Would you like to add another item (y/n)?"));
                if(!"true".equalsIgnoreCase(continueResponse)){
                    System.out.println("Your checkout list: ");
                    printList(myList);
                    break;
                }
            }
        }
    }
}
