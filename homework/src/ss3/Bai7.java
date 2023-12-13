package ss3;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap cot");
        int cols = Integer.parseInt(sc.nextLine());

        int [][] arr = new int[rows][cols];
        System.out.println("nhap cac phan tu cua mang");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("nhap phan tu thu " +i+" "+j+":");
                arr[i][j] =Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mang vua nhap la");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]);
                System.out.println();
            }
        }
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (row == column){
                    sum += arr[row][column];
                }
            }
            System.out.println("Tong cac duong cheo cua ma tran" + sum);
        }
    }

}
