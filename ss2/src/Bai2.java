public class Bai2 {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N = 2;

        System.out.println("Danh sách 20 số nguyên tố đầu tiên");

        while (count < numbers){
            if (checkNumbers(N)){
                System.out.print(N + " ");
                count++;
            }
            N++;
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

