package Bai_tap;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền VND vào đây");
        usd = sc.nextInt();
        int changeMoney = usd * 23000;
        System.out.println("Số tiền sau quy đổi");
        System.out.println(changeMoney);

    }
}
