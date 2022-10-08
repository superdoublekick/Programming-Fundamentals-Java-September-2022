import java.util.Scanner;

public class FactorielDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secNum = Integer.parseInt(sc.nextLine());

        long fact1 = calculateFactorial(firstNum);
        long fact2 = calculateFactorial(secNum);
        double division = fact1 * 1.0 / fact2;
        System.out.printf("%.2f",division);

    }
    public static long calculateFactorial(int number) {

        long fact = 1;
        for (int i = 1; i <= number ; i++) {

            fact = fact*i;
        }
        return fact;
    }
}
