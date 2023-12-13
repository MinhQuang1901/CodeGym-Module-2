package ss6.Bai1;

public class Circle {
    private double radius = 1.2;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAcreage(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hinh tron co ban kinh = " + getRadius() +
                ". Co mau " + getColor() +
                ". Dien tich = " + getAcreage();
    }
}
