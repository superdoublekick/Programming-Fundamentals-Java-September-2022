import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bigNum = sc.nextLine();
        int digit = Integer.parseInt(sc.nextLine());

        BigInteger newNum = new BigInteger(bigNum);
        System.out.println(newNum.multiply(BigInteger.valueOf(digit)));



    }
}
