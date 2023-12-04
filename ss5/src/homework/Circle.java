package homework;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());

//      System.out.println("Radius: " + myCircle.radius);
//      System.out.println("Area: " + myCircle.color);

    }
}






