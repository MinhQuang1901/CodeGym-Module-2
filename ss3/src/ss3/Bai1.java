package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myNumbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(" Nhập phần tử cần xóa");
        int x = Integer.parseInt(sc.nextLine());
        if (x < 0 || x > myNumbers.length) {
            System.out.print("Nhập từ số 0-6");
            return;
        }
        boolean isDelete = false;
        for (int i = 0; i < myNumbers.length - 1; i++){
            if (x == i) {
                isDelete = true;
            }

            if (isDelete) {
                myNumbers[i] = myNumbers[i+1];
            }

        }
        myNumbers[myNumbers.length-1] = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.print(myNumbers[i] + " ");
        }
    }
}
