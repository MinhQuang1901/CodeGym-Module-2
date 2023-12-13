package ss4;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }

    public double getRoot1(){
        double detal = getDiscriminant();
        if(detal >= 0){
            return (-b + Math.pow(detal, 0.5));
        } else {
            return 0;
        }
    }

    public double getRoot2(){
        double detal = getDiscriminant();
        if(detal >= 0){
            return (-b - Math.pow(detal, 0.5));
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị cho a: ");
        a = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập giá trị cho b: ");
        b = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập giá trị cho c: ");
        c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double detal = equation.getDiscriminant();

        if (detal > 0){
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("Nghiệm 1 " + equation.getRoot1());
            System.out.println("Nghiệm 2 " + equation.getRoot2());
        } else if (detal == 0) {
            System.out.println("Phương trình có 1 nghiệm kép " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
        scanner.close();
    }
}
