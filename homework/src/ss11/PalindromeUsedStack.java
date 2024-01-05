package ss11;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeUsedStack {
    public static boolean isPalindrome(String inputString){
        Stack<Character> stack = new Stack<>();
        int length = inputString.length();
        int halfLength = length / 2;

        for (int i = 0; i < halfLength; i++) {
            stack.push(inputString.charAt(i));
        }

        int halfIndex = halfLength + (length % 2);
        for (int i = halfIndex; i < length ; i++) {
            char currentChar = inputString.charAt(i);
            if (stack.isEmpty() || currentChar != stack.pop()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String inputString =  scanner.nextLine();
        if (isPalindrome(inputString)){
            System.out.println("Chuoi la doi xung");
        } else {
            System.out.println("Chuoi khong doi xung");
        }
    }
}
