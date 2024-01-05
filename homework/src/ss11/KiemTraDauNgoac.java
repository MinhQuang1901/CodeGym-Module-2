package ss11;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static boolean check(String dauNgoac) {
        Stack<Character> stack = new Stack<>();

        for (char sym : dauNgoac.toCharArray()){
            if (sym == '(' || sym == '[' || sym == '{') {
                stack.push(sym);
            } else if (sym == ')' || sym == ']' || sym == '}' ){
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (!isMatching(left, sym)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char left, char right){
        return (left == '(' && right == ')')
                || (left == '[' && right == ']')
                || (left == '{' && right == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dauNgoac = scanner.nextLine();
        boolean hople = check(dauNgoac);
        if(hople){
            System.out.println("Dau ngoac hop le");
        } else {
            System.out.println("Dau ngoac khong hop le");
        }
    }
}
