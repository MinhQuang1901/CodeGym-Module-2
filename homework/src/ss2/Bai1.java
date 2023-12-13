package ss2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chon hinh/n" +
                    "1. Ve hinh chu nhat/n" +
                    "2. Ve hinh tam giac vuong/n" +
                    "3. Ve hinh tam giac can/n" +
                    "4. Thoat");

            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    for (int i = 0; i < 3; i++){
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6 ; i++){
                        for (int j = 0; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 6; i++){
                        for (int j = 0; j < 6 - i; j++ ){
                            System.out.print(" ");
                        }

                        for (int k = 1; k <= 2 * i - 1; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                default:
                    flag = false;
            }
        } while (flag);
        System.out.println("Ket thuc chuong trinh");
    }
}
