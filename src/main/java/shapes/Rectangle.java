package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    //    protected int length;
//    protected int width;
//
//    public Rectangle(int inputLength, int inputWidth) {
//        this.length = inputLength;
//        this.width = inputWidth;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//    public int getPerimeter(){
//        return (length * 2) + (width * 2);
//    }
}
