package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super (side, side);
    }

    public int getArea(){
        System.out.println("override function");
        return this.length * this.width;
    }

    public int getPerimeter(){
        System.out.println("override function");
        return this.length * 4;
    }


}
