package shapes;

public class Rectangle {

    public int length;
    public int width;

    public Rectangle(int inputLength, int inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
    }

    public int getArea(){
        return length * width;
    }
    public int getPerimeter(){
        return (length * 2) + (width * 2);
    }
}
