package shapes;

public class ShapesTest {
    static Measurable myShape = new Rectangle(2, 4);
    public static void main(String[] args) {
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
//        System.out.println(myShape.getWidth());
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
    }
}
