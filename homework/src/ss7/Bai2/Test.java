package ss7.Bai2;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(4.0);
        shapes[1] = new Rectangle(4.0,5.0);
        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());

            if (shape instanceof Colorable) {
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
        }
    }
}
