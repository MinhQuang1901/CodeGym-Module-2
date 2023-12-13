package ss7.Bai1;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5, 3.9);
        System.out.println(rectangle);
        System.out.println("Diện tích trước: " + rectangle.getArea());
        rectangle.resize(10);
        System.out.println("Diện tích sau: " + rectangle.getArea());

        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println("Diện tích trước: " + circle.getArea());
        circle.resize(10);
        System.out.println("Diện tích sau: " + circle.getArea());

    }
}
