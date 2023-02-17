package grocerylist;

public class GroceryTest {


    public static void main(String[] args) {
        Grocery groc1 = new Grocery("Broccoli", "Vegetable", 5);
        groc1.setCategory("Fruit");
        System.out.println(groc1);
        System.out.println(groc1.getQuantity());
    }
}
