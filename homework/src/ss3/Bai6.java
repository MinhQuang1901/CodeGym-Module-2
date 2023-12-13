package ss3;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng");
        int row = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập số cột");
        int col = Integer.parseInt(sc.nextLine());

        double[][] maTran = new double[row][col];

        inputArray(sc, maTran);

        System.out.println("Nhập số cột để tính tổng:");
        int columnIndex = Integer.parseInt(sc.nextLine());

        double total = totalCol(maTran, columnIndex);
        System.out.println("Tổng của cột " + columnIndex + " là: " + total);
    }

    public static void inputArray(Scanner sc, double[][] maTran) {
        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[0].length; j++) {
                System.out.println("Nhập giá trị tại [" + i + "][" + j + "]");
                maTran[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
    }

    public static double totalCol(double[][] maTran, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < maTran.length; i++) {
            sum += maTran[i][columnIndex];
        }
        return sum;
    }
}
