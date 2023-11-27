public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100");

        for (int i = 2; i <= 100; i++){
            if (checkNumbers(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean checkNumbers(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
