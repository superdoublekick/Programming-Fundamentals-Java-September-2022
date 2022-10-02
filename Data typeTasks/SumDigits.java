import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while(n>0) {
            int currentNum = n%10;
            n = n/10;
            sum += currentNum;

        }
        System.out.println(sum);
    }
}
