package ss2.src;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Select geometry/n" +
                    "1. Print the rectangle/n" +
                    "2. Print the square triangle/n" +
                    "3. Print isosceles triangle/n" +
                    "4. Exit");

            int select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    for (int i = 0 ; i < 3; i++) {
                        for (int j = 0; j < 7; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++){
                        for (int j = 0; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 5; i++){
                        for (int j = 0; j <= 5 - i; j++){
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
        System.out.println("The end");
    }
}
