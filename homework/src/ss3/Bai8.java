package ss3;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        String str = "Minh Quang";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character you want to count:");
        char character = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Number of occurrences of the character'" + character + "'in string is: " + count);
    }
}
