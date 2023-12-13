package ss1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD vào đây");
        usd = Double.parseDouble(sc.nextLine());
        double quydoi = usd * 23000;
        System.out.println(quydoi + "đ");




    }
}
