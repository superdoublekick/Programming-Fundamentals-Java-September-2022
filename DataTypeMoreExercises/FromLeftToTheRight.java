import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = Long.parseLong(sc.nextLine());


        for (long i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            long num1 = Long.parseLong(numbers[0]);
            long num2 = Long.parseLong(numbers[1]);
            long currentNum_1 = num1;
            long currentNum_2 = num2;
            long sum =0;

            if (currentNum_1 > currentNum_2) {
                for (long j = 0; j < String.valueOf(num1).length(); j++) {
                    long lastDigit = currentNum_1 % 10;
                    currentNum_1 = currentNum_1 / 10;
                    sum += lastDigit;

                }
            } else  {
                for (long j = 0; j < String.valueOf(num2).length(); j++) {
                    long lastDigit = currentNum_2 % 10;
                    currentNum_2 = currentNum_2 / 10;
                    sum += lastDigit;

                }
            }
            System.out.println(sum);
        }

    }
}

