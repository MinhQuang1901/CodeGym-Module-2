package ss15_Thuc_Hanh;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Debug {
        public static void main(String[] args) {
            System.out.println("Giải phương trình tuyến tính");
            System.out.println("Cho phương trình 'a * x + b = 0', Nhập hằng số:");

            Scanner scanner = new Scanner(System.in);

            int[] arr = {1, 2, 33};
            int c = 0;
            System.out.print("a: ");
            double a = scanner.nextDouble();

            System.out.print("b: ");
            double b = scanner.nextDouble();

            if (a != 0) {
                double solution = -b / a;
                System.out.printf("Phương trình có nghiệm: %f!", solution);
            } else {
                if (b == 0) {
                    System.out.print("Phương trình có nghiệm: x!");
                } else {
                    System.out.print("Phương trình vô nghiệm");
                }
            }
        }
    }