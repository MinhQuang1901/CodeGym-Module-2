package ss3.src;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập kích thước của mảng 1:");
        int size1 = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập kích thước của mảng 2:");
        int size2 = Integer.parseInt(sc.nextLine());

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        System.out.println("Nhập giá trị của mảng 1:");
        inputArray(sc, array1);
        System.out.println("Nhập giá trị của mảng 2:");
        inputArray(sc, array2);

        int[] array3 = mergeTwoArrays(array1, array2);
        System.out.println("Mảng sau khi gộp:");
        displayArray(array3);

        sc.close();
    }

    public static void inputArray(Scanner scanner, int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static int[] mergeTwoArrays(int[] array1, int[] array2){
        int sizeArray3 = array1.length + array2.length;
        int[] array3 = new int[sizeArray3];

        System.arraycopy(array1, 0, array3, 0 , array1.length);
        System.arraycopy(array2, 0, array3, array1.length , array2.length);

        return array3;
    }

    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }
}
