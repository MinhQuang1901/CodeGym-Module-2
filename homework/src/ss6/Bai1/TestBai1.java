package ss6.Bai1;

import ss6.Bai1.Circle;
import ss6.Bai1.Cylinder;

public class TestBai1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(8,"yellow");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(8.9,"xanh la",9.5);
        System.out.println(cylinder);
    }
}
