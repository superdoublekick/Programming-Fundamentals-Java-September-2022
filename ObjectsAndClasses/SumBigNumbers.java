import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(sc.nextLine());
        BigInteger secNum = new BigInteger(sc.nextLine());
        BigInteger sum = firstNum.add(secNum);
        System.out.println(sum);

    }
}
