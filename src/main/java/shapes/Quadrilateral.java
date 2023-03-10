package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected int length;
    protected int width;

    public abstract int getLength(int length);

    public void setLength(int length) {
        this.length = length;
    }

    public abstract int getWidth(int width);

    public void setWidth(int width) {
        this.width = width;
    }

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
