import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n ; i++) {

            if(isDivisible(i) && isContainOddDigits(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isDivisible(int number) {
        int sumDigits = 0;
        while (number>0) {
            int lastDigit = number%10;
            sumDigits += lastDigit;
            number = number/10;
        }
        return sumDigits % 8 == 0;
    }
    public static boolean isContainOddDigits(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 != 0) {

                return true;
            } else {
                number = number/10;
            }
        }
        return false;
    }
}
