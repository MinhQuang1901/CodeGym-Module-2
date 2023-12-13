package ss1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số vào đây");

        int n = Integer.parseInt(scanner.nextLine());
        int n1 = n, n2 = n;
        int b = n1 % 10, a = n2 / 10;

        String[] chu_so_hang_don_vi = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
        String[] hai_chu_so = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
        String[] ten_multiple  = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};

        if (a == 1){
            System.out.println(hai_chu_so[b+1]);
        } else if (b == 0) {
            System.out.println(ten_multiple[a]);
        } else {
            System.out.println(ten_multiple[a] + " - " + chu_so_hang_don_vi[b]);
        }
    }
}
