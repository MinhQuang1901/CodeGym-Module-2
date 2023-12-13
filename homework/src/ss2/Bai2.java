package ss2;

public class Bai2 {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int N = 2;

        //So nguyen to la so >1 , chia het cho 1 va chinh no
        System.out.println("Danh sach 20 so nguyen to dau tien");

        while (count < number) {
            if (checkNumbers(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    static boolean checkNumbers(int n){
        if (n <= 1) {
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
