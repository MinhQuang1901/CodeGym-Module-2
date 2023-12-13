package ss2;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100");

        for (int i = 2; i <= 100; i++){
            if (checkNumber(i)){
                System.out.print(i + "");
            }
        }
    }
    static boolean checkNumber(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
