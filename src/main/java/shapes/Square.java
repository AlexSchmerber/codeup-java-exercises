package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super (side, side);
    }

    @Override
    public int getArea(){
        System.out.println("override");
        return this.length * this.width;
    }

    @Override
    public int getPerimeter(){
        System.out.println("override");
        return this.length * 4;
    }
}
