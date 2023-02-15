package shapes;

public class Rectangle {

    public static int length;
    public static int width;

    public Rectangle(int inputLength, int inputWidth) {
        length = inputLength;
        width = inputWidth;
    }

    public int getArea(){
        return length * width;
    }
    public int getPerimeter(){
        return (length * 2) + (width * 2);
    }
}
