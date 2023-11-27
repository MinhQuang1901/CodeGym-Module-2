package Bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here");
        int num = Integer.parseInt(sc.nextLine());
        if (num / 100 != 0){
            int d = num / 100;
            switch (num){
                case 1: System.out.println("One hundred");
                    break;
                case 2: System.out.println("Two hundred");
                    break;
                case 3: System.out.println("Three hundred");
                    break;
                case 4: System.out.println("Four hundred");
                    break;
                case 5: System.out.println("Five hundred");
                    break;
                case 6: System.out.println("Six hundred");
                    break;
                case 7: System.out.println("Seven hundred");
                    break;
                case 8: System.out.println("Eight hundred");
                    break;
                case 9: System.out.println("Nine hundred");
                    break;
            }
        }

        

//        if(num > 0 && num < 10){
//            switch (num){
//                case 1: System.out.println("One");
//                    break;
//                case 2: System.out.println("Two");
//                    break;
//                case 3: System.out.println("Three");
//                    break;
//                case 4: System.out.println("Four");
//                    break;
//                case 5: System.out.println("Five");
//                    break;
//                case 6: System.out.println("Six");
//                    break;
//                case 7: System.out.println("Seven");
//                    break;
//                case 8: System.out.println("Eight");
//                    break;
//                case 9: System.out.println("Nine");
//                    break;
//            }
        }
    }


