package ss3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng của ma trận: ");
        int soHang = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập số cột của ma trận: ");
        int soCot = Integer.parseInt(sc.nextLine());

        double[][] maTran = new double[soHang][soCot];

        nhapMaTran(sc, maTran);

        double[] result = timGiaTriNhoNhat(maTran);

        System.out.println("Phần tử lớn nhất của ma trận là " + result[0]
                + " tại vị trí [" + (int) result[1] + "][" + (int) result[2] + "]");

        sc.close();
    }

    public static void nhapMaTran(Scanner sc, double[][] maTran) {
        System.out.println("Nhập giá trị cho ma trận");
        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[0].length; j++) {
                System.out.println("Nhập giá trị tại [" + i + "][" + j + "]");
                maTran[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
    }

    public static double[] timGiaTriNhoNhat(double[][] maTran) {
        double minValue = maTran[0][0];
        int hang = 0;
        int cot = 0;

        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[0].length; j++) {
                if (maTran[i][j] < minValue) {
                    minValue = maTran[i][j];
                    hang = i;
                    cot = j;
                }
            }
        }

        double[] result = {minValue, hang, cot};
        return result;
    }
}
