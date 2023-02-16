package shapes;

public class Square extends Quadrilateral{
    public Square(int length, int width) {
        super(length, width);
    }
    private int side;

    @Override
    public int getLength(int length) {
        return this.length;
    }

    @Override
    public void setLength(int side) {
        super.setLength(side);
    }

    @Override
    public int getWidth(int width) {
        return this.width;
    }

    @Override
    public void setWidth(int side) {
        super.setWidth(side);
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
