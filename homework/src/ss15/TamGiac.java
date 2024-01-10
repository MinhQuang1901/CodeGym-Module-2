package ss15;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap canh tam giac thu 1");
            double x = scanner.nextInt();
            System.out.println("Nhap canh tam giac thu 2");
            double y = scanner.nextInt();
            System.out.println("Nhap canh tam giac thu 3");
            double z = scanner.nextInt();

            checkTamGiac(x , y, z);

            System.out.println("Ba canh tren la cac canh cua 1 tam giac hop le");
        } catch (TamGiacException e) {
            System.out.println("Loi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Loi: Nhap vao khong phai la so.");
        } finally {
            System.out.println("hello");
            scanner.close();
        }
    }

    static void checkTamGiac(double x, double y, double z) throws TamGiacException {
        if (x <= 0 ||
            y <= 0 ||
            z <= 0 ||
            x + y <= z ||
            y + z <= x ||
            x + z <= y) {
            throw new TamGiacException("Ba canh khong hop le.");
        }
    }

    static class TamGiacException extends Exception {
        public TamGiacException(String message) {
            super(message);
        }
    }
}
