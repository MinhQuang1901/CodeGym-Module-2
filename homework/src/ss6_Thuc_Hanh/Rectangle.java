package ss6_Thuc_Hanh;

public abstract class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
    }

    public Rectangle(double with, double length) {
        this.width = with;
        this.length = length;
    }

    public Rectangle(double with, double length, String color, boolean filler){
        super(color, filler);
        this.width = with;
        this.length = length;
    }

    public double getWith() {
        return width;
    }

    public void setWith(double with) {
        this.width = with;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return " A rectangle with width = " + getWith()
                + " and length=" + getLength()
                + ", which is a subclass of"
                + super.toString();
    }

    public abstract void setWidth(double width);
}
