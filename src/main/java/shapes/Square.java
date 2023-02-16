package shapes;

public class Square extends Quadrilateral{
    public Square(int length, int width) {
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
    //    public Square(int side) {
//        super (side, side);
//    }
//
//    @Override
//    public int getArea(){
//        System.out.println("override");
//        return this.length * this.width;
//    }
//
//    @Override
//    public int getPerimeter(){
//        System.out.println("override");
//        return this.length * 4;
//    }
}
