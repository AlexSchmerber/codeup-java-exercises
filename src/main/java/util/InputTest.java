package util;

import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.println(myInput.getString());

        int x = myInput.getInt(1,10);
        System.out.println(x);

        double y = myInput.getDouble(1.0, 10.0);
        System.out.println(y);
    }
}
