package ss6.Bai1;

import ss6.Bai1.Circle;

public class Cylinder extends Circle {
    private double heght = 2.4;

    public Cylinder(){
    }

    public Cylinder(double heght) {
        this.heght = heght;
    }

    public Cylinder(double radius, String color, double heght) {
        super(radius, color);
        this.heght = heght;
    }

    public double getHeght() {
        return heght;
    }

    public void setHeght(double heght) {
        this.heght = heght;
    }
    public double volume(){
        return getRadius() * getRadius() * heght * Math.PI;
    }

    @Override
    public String toString() {
        return "Hinh tru voi ban kinh = " + getRadius()
                + " Chieu cao cua hinh tru la " + getHeght()
                + " Mau cua hinh tru la " + getColor()
                + " The tich = " + volume();
    }
}
