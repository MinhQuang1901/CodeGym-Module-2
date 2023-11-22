import java.util.Scanner;

public class Bai2_money_change {
    public static void main(String[] args) {
       float vnd = 23000;
       float usd;
       Scanner num = new Scanner(System.in);
       System.out.println("Nhập số USD");
       vnd = num.nextFloat();
       float change = vnd * 23000;
       System.out.println("Số tiền VND là: " + change);
    }
}
