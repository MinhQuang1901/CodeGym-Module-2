package ss11;

import java.util.Stack;

public class Bai1 {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int i: array){
            stack.push(i);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static String reverseString(String input){
        Stack<String> wStack = new Stack<>();
        StringBuilder output = new StringBuilder();

        //TACH TUNG PHAN TU VA DUA VAO STACK
        String[] words = input.split("\\s+");
        for (String word: words) {
            wStack.push(word);
        }

        //LAY TUNG STACK VA NOI VAO CHUOI MOI
        while(!wStack.isEmpty()){
            output.append(wStack.pop()).append(" ");
        }

        //LOAI BO KHOANG TRANG
        return output.toString().trim();
    }

    public static void main(String[] args) {
        int[] integerArray = {1,2,3,4,5};
        System.out.println("Original array (Mang goc): " + java.util.Arrays.toString(integerArray));
        reverseArray(integerArray);
        System.out.println("Reverse array (dao nguoc mang): " + java.util.Arrays.toString(integerArray));

        String inputString = "Hello Quang";
        System.out.println("Original string: " + inputString);
        String reverseString = reverseString(inputString);
        System.out.println("Reverse string: " + reverseString);
    }
}
