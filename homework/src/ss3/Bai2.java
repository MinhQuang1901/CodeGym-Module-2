package ss3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giá trị cho mảng đầu tiên");
        int N = Integer.parseInt(sc.nextLine());

        int[] array = new int[N];

        System.out.println("Nhập giá trị cho mảng:");
        for (int i = 0; i < N; i++){
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Nhập giá trị cần chèn: ");
        int insertValue = sc.nextInt();

        System.out.println("Nhập vị trí cần chèn (từ 1 đến " + N + "): ");
        int insertLocation = sc.nextInt();

        if (insertLocation < 1 || insertLocation > N + 1){
            System.out.println("Vị trí không hợp lệ. Mảng không được thay đổi");
        } else {
            insertValueIntoPosition(array, insertValue, insertLocation);

            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + "  ");
            }
        }
        sc.close();
    }

    public static void insertValueIntoPosition(int[] arr, int value, int position ) {
        for (int i = arr.length - 1; i > position - 1; i--){
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = value;
    }
}
