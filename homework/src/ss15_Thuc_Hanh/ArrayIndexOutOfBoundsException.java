package ss15_Thuc_Hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng:");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrayExample = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua 1 phan tu bat ky: ");
        int x = scanner.nextInt();
//        System.out.println("Gia tri cua phan tu co chi so 5" + x + " la " + arr[x]);
        try {
            System.out.println("Gia tri cua phan tu co chi so 5" + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chi so vuot qua gioi gian cua mang");
        }
    }
}
