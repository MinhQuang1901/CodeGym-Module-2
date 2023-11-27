import java.util.Scanner;

public class QuadraticEquation {
        private double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            double delta = getDiscriminant();
            if (delta >= 0) {
                return (-b + Math.pow(delta, 0.5)) / (2 * a);
            } else {
                return 0;
            }
        }

        public double getRoot2() {
            double delta = getDiscriminant();
            if (delta >= 0) {
                return (-b - Math.pow(delta, 0.5)) / (2 * a);
            } else {
                return 0;
            }
        }

        public static void main(String[] args) {
            // Nhập giá trị cho a, b, c từ người dùng
            double a, b, c;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập giá trị cho a: ");
            a = scanner.nextDouble();

            System.out.print("Nhập giá trị cho b: ");
            b = scanner.nextDouble();

            System.out.print("Nhập giá trị cho c: ");
            c = scanner.nextDouble();

            // Tạo đối tượng QuadraticEquation
            QuadraticEquation equation = new QuadraticEquation(a, b, c);

            // Tính delta và hiển thị kết quả
            double delta = equation.getDiscriminant();

            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.println("Nghiệm 1: " + equation.getRoot1());
                System.out.println("Nghiệm 2: " + equation.getRoot2());
            } else if (delta == 0) {
                System.out.println("Phương trình có 1 nghiệm kép: " + equation.getRoot1());
            } else {
                System.out.println("Phương trình không có nghiệm thực.");
            }

            // Đóng đối tượng Scanner
            scanner.close();
        }
    }

